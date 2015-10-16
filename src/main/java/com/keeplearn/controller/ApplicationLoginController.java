package com.keeplearn.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.keeplearn.util.Constants;


@Controller
public class ApplicationLoginController {

	
	
	@RequestMapping(value="login", method = RequestMethod.GET)
	public String login(@RequestParam(value="login_error", required=false)String error, @RequestParam(value="logout",required=false)String logout, @RequestParam(value="urlHit",required=false)String urlHit ,ModelMap model, HttpServletRequest request){
		
		String reffere = request.getHeader("referer");
		
		System.out.println("Reffer  : "+reffere);
		
		if(error != null){
			model.addAttribute("error", "Invalid username and password");
		}
		else if(logout != null){
			model.addAttribute("msg", "You've been logged out successfully.");
		}
		else if(urlHit != null || reffere == null){
			model.addAttribute("urlHit", "Login please");
		}
		return Constants.LOGIN_VEIW;
	}
	
	
	@RequestMapping(value="accessDenied" ,method =RequestMethod.GET)
	public String accessDenied(ModelMap modelMap){

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		UserDetails userDetails = null;
		
		if(authentication != null){
			Object object = authentication.getPrincipal();
			if(object instanceof UserDetails)
				userDetails = (UserDetails)object;
		}
		
		String user = userDetails != null ? userDetails.getUsername() : "Guest ";
		String message = "Hi "+ user +"You don't have priviliges to view this page!!";
		
		SecurityContextHolder.clearContext();
		
		modelMap.addAttribute(Constants.DYNAMIC_MESSAGE, message);
		return Constants.ACCESS_DENIED;
	}
}
