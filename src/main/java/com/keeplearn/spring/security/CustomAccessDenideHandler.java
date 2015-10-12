package com.keeplearn.spring.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;


@Component("customAccessDenideHandler")
public class CustomAccessDenideHandler implements AccessDeniedHandler{
	
	
	
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
		
		String accessDenied = request.getContextPath()+"/accessDenied";
		response.sendRedirect(accessDenied);
		
	}
}
