/**
 * 
 */
package com.keeplearn.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.keeplearn.entity.QuizTopicModel;
import com.keeplearn.exception.DuplicateDataException;
import com.keeplearn.service.TechnologyService;
import com.keeplearn.service.TopicService;
import com.keeplearn.util.Constants;

/**
 * @author santosh.chourasiya
 *
 */
@Controller
@RequestMapping(value="admin")
public class TopicController implements Constants {

	
	@Autowired
	private TopicService topicService;
	@Autowired
	private TechnologyService technologyService;
	
	@ModelAttribute
	public void userDetails(ModelMap modelMap){
		System.out.println("model attribute invoked.......");
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		UserDetails userDetails = null;
		if(!(authentication instanceof AnonymousAuthenticationToken)){
			userDetails = (UserDetails)authentication.getPrincipal();
		}
		
		modelMap.addAttribute(USER_DETAILS, userDetails != null ? userDetails.getUsername() : null);
	}
	
	
	@RequestMapping(value="addTopic" , method = RequestMethod.GET)
	public String addNewQuizTopicPage(ModelMap modelMap){
		
		modelMap.addAttribute("addQuizTopic", new QuizTopicModel());
		modelMap.addAttribute(DYNAMIC_PAGE, ADD_TOPIC);
		
		Map<Integer, String> models = technologyService.getAllTechnology();
		
		modelMap.addAttribute("technologyMap",models);
		
		return ADMIN_WELCOME;
	}
	
	
	
	@RequestMapping(value="addTopic" , method = RequestMethod.POST)
	public String addNewQuizTopic(@ModelAttribute("quizTopic") QuizTopicModel quizTechTopicModel, HttpSession session, ModelMap modelMap , RedirectAttributes redirectAttributes){
	
		
		if(quizTechTopicModel.getMultipartFile().isEmpty()){
			redirectMethod(redirectAttributes, "addTopic", "Oops some problem occured try again");
		}
		
		try{
			
			byte []bytes = quizTechTopicModel.getMultipartFile().getBytes();
			String path = session.getServletContext().getRealPath("/foundation/images");
			path = path+File.separator+quizTechTopicModel.getTopicImage();
			System.out.println("Path  : "+path);
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(path)));
			stream.write(bytes);
			stream.flush();
			stream.close();
			
			topicService.addNewQuizTopic(quizTechTopicModel);

			modelMap.addAttribute(DYNAMIC_MESSAGE, "Topic Added Successfully..");
			modelMap.addAttribute(DYNAMIC_PAGE, SHOW_NEW_QUIZ_DESCRIPTION);
			modelMap.addAttribute(DESCRIBE,"TOPIC");
			modelMap.addAttribute(COMMON_ATTRIBUTE, quizTechTopicModel);

			
		}
		catch(DuplicateDataException duplicateDataException){
			return redirectMethod(redirectAttributes, "addTopic", "Duplicate Topic");
		}
		catch(Exception exception){
			exception.printStackTrace();
			return redirectMethod(redirectAttributes, "addTopic", "Oops some problem occured try again");
		}
		
		return ADMIN_WELCOME;
		
	}
	
	private String redirectMethod(RedirectAttributes redirectAttributes, String redirectUrl , String message){
		redirectAttributes.addFlashAttribute(DYNAMIC_MESSAGE, message);
		return "redirect:"+redirectUrl;
	}
	
	
	@RequestMapping(value = "getTopicList" , method = RequestMethod.GET)
	public String getTopicList(ModelMap modelMap){
		
		List<QuizTopicModel> topicModels = topicService.getTopicList();
		modelMap.addAttribute(COMMON_ATTRIBUTE,topicModels);
		modelMap.addAttribute(DYNAMIC_PAGE, TOPIC_LIST);
		return ADMIN_WELCOME;
		
	}

	
}
