/**
 * 
 */
package com.keeplearn.controller;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.keeplearn.util.Constants;

/**
 * @author santosh.chourasiya
 *
 */
@Controller
@RequestMapping(value="/admin")
public class ApplicationAdminActivityController implements Constants{
	
	
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
	
	
	@RequestMapping(value="/welcome" , method = RequestMethod.GET)
	public String welcome(ModelMap modelMap){
		modelMap.addAttribute(DYNAMIC_PAGE, DEFAULT_PAGE);
		return ADMIN_WELCOME;
	}
	
}
