/**
 * 
 */
package com.keeplearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.keeplearn.util.Constants;

/**
 * @author santosh
 *
 */
@Controller
public class StaticServeController {

	@RequestMapping(value="aboutUs", method=RequestMethod.GET)
	public String aboutUs(){
		return Constants.ABOUT_US;
	}
	
	@RequestMapping(value="contact" , method = RequestMethod.GET)
	public String contactUs(){
		return Constants.CONTACT;
	}
	
	@RequestMapping(value="blog", method = RequestMethod.GET)
	public String blog(){
		return Constants.BLOG;
	}
	
	@RequestMapping(value="services" , method = RequestMethod.GET)
	public String services(){
		return Constants.SERVICES;
	}
}
