package com.keeplearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.keeplearn.model.UserServiceBean;

@Controller
public class ApplicationEntryController {
	
	@RequestMapping(value="welcome", method = RequestMethod.GET)
	public String welcome(ModelMap map){
		map.addAttribute("command", new UserServiceBean());
		return "welcome";
	}
	
	@RequestMapping(value="quizeContentMenu", method = RequestMethod.GET)
	public String quizContentMenu(ModelMap modelMap){
		return "quizeContentMenu";
	}
	
	@RequestMapping(value="quizeTopicContent" , method =  RequestMethod.GET)
	public String quizeTopicContentMenu(ModelMap modelMap){
		return "quizeTopicContentMenu";
	}
	
	@RequestMapping(value="quizeView", method = RequestMethod.GET)
	public String quizeView(ModelMap modelMap){
		return "quizeView";
	}
	
}
