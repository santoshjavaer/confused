/**
 * 
 */
package com.keeplearn.controller;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.keeplearn.entity.QuestionModel;
import com.keeplearn.entity.QuestionSetModel;
import com.keeplearn.entity.QuizTechModel;
import com.keeplearn.entity.QuizTopicModel;
import com.keeplearn.exception.DuplicateDataException;
import com.keeplearn.model.CommonQuestionModel;
import com.keeplearn.model.SetMappingModel;
import com.keeplearn.service.QuestionService;
import com.keeplearn.service.SetService;
import com.keeplearn.service.TechnologyService;
import com.keeplearn.service.TopicService;
import com.keeplearn.util.Constants;

/**
 * @author santosh.chourasiya
 *
 */
@Controller
@RequestMapping(value="admin")
public class QuizController implements Constants{

	@Autowired
	private TechnologyService technologyService;
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private TopicService topicService;
	
	@Autowired
	private SetService setService;
	
	@RequestMapping(value="createQuiz", method = RequestMethod.GET)
	public String createQuiz(ModelMap modelMap){
		
		//modelMap.addAttribute(COMMON_OBJECT, new CommonQuestionModel());
		modelMap.addAttribute(COMMON_OBJECT, new QuizTopicModel());
		
		modelMap.addAttribute(DYNAMIC_PAGE, CREATE_QUIZ);
		Map<Integer, String> models = technologyService.getAllTechnology();
		modelMap.addAttribute(TECHNOLOGY_MAP,models);
		return ADMIN_WELCOME;
		
	}
	
	
	
	@RequestMapping(value = "createQuiz" , method = RequestMethod.POST)
	public String createQuiz(@ModelAttribute("technology") QuizTechModel technology , ModelMap modelMap){
		
		modelMap.addAttribute(COMMON_OBJECT, new QuestionSetModel());
		
		modelMap.addAttribute(DYNAMIC_PAGE, CREATE_SET);
		
		List<QuizTopicModel> topicModels = topicService.getAllTopic(technology.getId());
		
		
		System.out.println(" TOPOIC MODEL : "+topicModels);
		
		Map<Integer, String> topicMap = getTopicMap(topicModels);
		modelMap.addAttribute(TOPIC_MAP,topicMap);
		
		return ADMIN_WELCOME;
	}

	
	private Map<Integer, String> getTopicMap(List<QuizTopicModel> quizTopicModels){
		
		Map<Integer, String> topicMap = new HashMap<Integer, String>();
		for(QuizTopicModel model : quizTopicModels){
			topicMap.put(model.getId(), model.getTopicName());
		}
		
		return topicMap;
		
	}
	
	
	
	@RequestMapping(value="createSet", method = RequestMethod.POST)
	public String createSetForQuestion(@ModelAttribute("questionSet") QuestionSetModel questionSetModel ,  ModelMap modelMap , RedirectAttributes redirectAttributes){
		

		if(questionSetModel == null){
			return redirectMethod(redirectAttributes, "createQuiz", "Ops some error occured..");
		}
		
		
		try{
			
			questionSetModel.setDate(Calendar.getInstance().getTime());
			
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			
			UserDetails userDetails = null;
			
			if(authentication != null){
				Object object = authentication.getPrincipal();
				if(object instanceof UserDetails)
					userDetails = (UserDetails)object;
			}
			
			if(userDetails != null){
				questionSetModel.setUserId(userDetails.getUsername());
			}
			
			QuestionSetModel setModel = setService.createSet(questionSetModel);
		
			modelMap.addAttribute(DYNAMIC_PAGE, QUESTION_SET_LIST);
			modelMap.addAttribute(COMMON_ATTRIBUTE, setModel);
			
			
		}catch(DuplicateDataException duplicateDataException){
			return redirectMethod(redirectAttributes, "createQuiz", "Duplicate Data");
		}catch(Exception exception){
			return redirectMethod(redirectAttributes, "createQuiz", "Ops some error occured..");
		}
		return ADMIN_WELCOME;
		
	}
	
	
	
	private String redirectMethod(RedirectAttributes redirectAttributes, String redirectUrl , String message){
		redirectAttributes.addFlashAttribute(DYNAMIC_MESSAGE, message);
		return "forward:"+redirectUrl;
	}
	
	
	
	
	
	/*@RequestMapping(value="createQuiz", method = RequestMethod.POST)
	public String createQuizAction(@ModelAttribute("commonObject") CommonQuestionModel commonQuestionModel ,ModelMap modelMap){
		
		System.out.println(commonQuestionModel);
		
		commonQuestionModel = portalService.createQuizSet(commonQuestionModel);
		modelMap.addAttribute(DYNAMIC_PAGE, CREATE_QUIZ_CONFIRMATION);
		modelMap.addAttribute(QUIZ_CONFIRMATION, commonQuestionModel);
		
		return ADMIN_WELCOME;
		
	}*/
	
	@RequestMapping(value="uploadQuestion", method = RequestMethod.GET)
	public String uploadQuestionView(@ModelAttribute("commonQuestion") CommonQuestionModel commonQuestionModel ,ModelMap modelMap, @RequestParam Map<String,String> allPathVariable){
		
		modelMap.addAttribute(COMMON_OBJECT, commonQuestionModel);
		modelMap.addAttribute(DYNAMIC_PAGE, UPLOAD_QUESTIONS);
		/*Map<Integer, String> models = portalService.getAllTechnology();
		modelMap.addAttribute(TECHNOLOGY_MAP,models);*/
		
		int technologyId = commonQuestionModel.getTechnologyId();
		
		if(technologyId <= 0){
			technologyId = Integer.parseInt(allPathVariable.get("technologyId"));
		}
		
		
		
		List<QuizTopicModel> topicModels = topicService.getAllTopic(commonQuestionModel.getTechnologyId());
		
		//List<String> listOfTopic = getTopicList(topicModels);
		
		modelMap.addAttribute(TOPIC_MAP,topicModels);
		return ADMIN_WELCOME;
		
	}
	
	@RequestMapping(value="uploadQuestion", method = RequestMethod.POST)
	public String uploadQuestion(@ModelAttribute("commonObject") QuestionModel questionModel , ModelMap modelMap){

		System.out.println(questionModel);
		QuestionModel attributeValue = questionService.uploadQuestion(questionModel);
		modelMap.addAttribute(COMMON_ATTRIBUTE, attributeValue);
		modelMap.addAttribute(DESCRIBE,QUESTION);
		modelMap.addAttribute(DYNAMIC_PAGE, QUESTION_DESCRIPTION);
		return ADMIN_WELCOME;
		
	}
	
	
	
	
	@RequestMapping(value = "getSetList" , method = RequestMethod.GET)
	public String setList(ModelMap modelMap){
		modelMap.addAttribute(DYNAMIC_PAGE, QUESTION_SET_LIST);
		return ADMIN_WELCOME;
	}
}
