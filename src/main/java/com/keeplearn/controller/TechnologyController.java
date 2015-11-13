/**
 * 
 */
package com.keeplearn.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
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

import com.keeplearn.entity.QuizTechModel;
import com.keeplearn.exception.DuplicateDataException;
import com.keeplearn.service.TechnologyService;
import com.keeplearn.util.Constants;

/**
 * @author santosh.chourasiya
 *
 */
@Controller
@RequestMapping(value = "admin")
public class TechnologyController implements Constants{

	
	@Autowired
	private TechnologyService technologyService;
	

	@ModelAttribute
	public void userDetails(ModelMap modelMap){

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		UserDetails userDetails = null;
		if(!(authentication instanceof AnonymousAuthenticationToken)){
			userDetails = (UserDetails)authentication.getPrincipal();
		}
		
		modelMap.addAttribute(USER_DETAILS, userDetails != null ? userDetails.getUsername() : null);
	}
	
	
	
	@RequestMapping(value="addQuizTech" , method = RequestMethod.GET)
	public String addNewQuizTitlePage(ModelMap modelMap , HttpServletRequest request){
		
		modelMap.addAttribute("addQuizTech", new QuizTechModel());
		modelMap.addAttribute(DYNAMIC_PAGE, ADD_TECHNOLOGY);
		return ADMIN_WELCOME;
		
	}
	
	@RequestMapping(value = "addQuizTech" , method = RequestMethod.POST)
	public String addNewTechnology(@ModelAttribute("quizTechModel") QuizTechModel quizTechModel , HttpSession session, ModelMap modelMap , RedirectAttributes redirectAttributes){
		
		if(quizTechModel.getMultipartFile().isEmpty()){
			return redirectMethod(redirectAttributes, "addQuizTech" , "Oops Some Problem Occure try again.");
		}
		
		try{
			
			byte []bytes = quizTechModel.getMultipartFile().getBytes();
			String path = session.getServletContext().getRealPath("/foundation/images");
			path = path+File.separator+quizTechModel.getImageName();
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(path)));
			stream.write(bytes);
			stream.flush();
			stream.close();
			
			QuizTechModel techModel = technologyService.addNewTechnology(quizTechModel);
			
			modelMap.addAttribute("quizTechModel", techModel);
			modelMap.addAttribute(DYNAMIC_PAGE, SHOW_NEW_QUIZ_DESCRIPTION);
			modelMap.addAttribute(DESCRIBE,"TECHNOLOGY");
			modelMap.addAttribute(COMMON_ATTRIBUTE, quizTechModel);
			modelMap.addAttribute(DYNAMIC_MESSAGE, "Technology Added Successfully..");
		}catch(DuplicateDataException duplicateDataException){
			return redirectMethod(redirectAttributes,"addQuizTech","Duplicate Entry");
		}
		catch(Exception exception){
			return redirectMethod(redirectAttributes, "addQuizTech", "Oops Some Problem Occure try again.");
		}
		
		return ADMIN_WELCOME;
	}
	
	private String redirectMethod(RedirectAttributes redirectAttributes, String redirectUrl , String message){
		redirectAttributes.addFlashAttribute(DYNAMIC_MESSAGE, message);
		return "redirect:"+redirectUrl;
	}
	
	
	@RequestMapping(value = "getTechnologyList" , method = RequestMethod.GET)
	public String getTechnologyList(ModelMap modelMap){
		
		List<QuizTechModel> techModels = technologyService.getTechnologyList();
		modelMap.addAttribute(COMMON_ATTRIBUTE,techModels);
		modelMap.addAttribute(DYNAMIC_PAGE, TECHNOLOGY_SET_LIST);
		return ADMIN_WELCOME;
	}

	
}
