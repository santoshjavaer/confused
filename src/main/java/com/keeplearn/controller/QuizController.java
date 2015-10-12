/**
 * 
 */
package com.keeplearn.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.keeplearn.entity.QuestionModel;
import com.keeplearn.entity.QuizTopicModel;
import com.keeplearn.model.CommonQuestionModel;
import com.keeplearn.model.SetMappingModel;
import com.keeplearn.service.QuestionService;
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
	
	
	@RequestMapping(value="createQuiz", method = RequestMethod.GET)
	public String createQuiz(ModelMap modelMap){
		
		modelMap.addAttribute(COMMON_OBJECT, new CommonQuestionModel());
		modelMap.addAttribute(DYNAMIC_PAGE, CREATE_QUIZ);
		Map<Integer, String> models = technologyService.getAllTechnology();
		modelMap.addAttribute(TECHNOLOGY_MAP,models);
		return ADMIN_WELCOME;
		
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
	
	
	
	@RequestMapping(value="createSetForQuestion", method = RequestMethod.GET)
	public String createSetForQuestion(ModelMap modelMap){
		modelMap.addAttribute("setMapping", new SetMappingModel());
		modelMap.addAttribute(DYNAMIC_PAGE, CREATE_SET);
		return ADMIN_WELCOME;
	}
	
	
	
	@RequestMapping(value = "getSetList" , method = RequestMethod.GET)
	public String setList(ModelMap modelMap){
		modelMap.addAttribute(DYNAMIC_PAGE, QUESTION_SET_LIST);
		return ADMIN_WELCOME;
	}
}
