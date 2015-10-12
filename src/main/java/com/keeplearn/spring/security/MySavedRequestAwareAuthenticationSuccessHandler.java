package com.keeplearn.spring.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component("mySavedRequestAwareAuthenticationSuccessHandler")
public class MySavedRequestAwareAuthenticationSuccessHandler extends
		SimpleUrlAuthenticationSuccessHandler {
	
	RequestCache requestCache = new HttpSessionRequestCache();
	
	
	
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		
		System.err.println("On Authentication Success method invoked.....");
		SavedRequest savedRequest = requestCache.getRequest(request, response);
		
		
		if(authentication != null){
			response.setStatus(HttpServletResponse.SC_OK);
		}
		
		if(savedRequest == null){
			clearAuthenticationAttributes(request);
			return;
		}
		String targetUrlParam = getTargetUrlParameter();
		
		if(isAlwaysUseDefaultTargetUrl() || (targetUrlParam != null && StringUtils.hasText(request.getParameter(targetUrlParam)))){
			clearAuthenticationAttributes(request);
			return;
		}
		clearAuthenticationAttributes(request);
		super.onAuthenticationSuccess(request, response, authentication);
	}


	/**
	 * @param requestCache the requestCache to set
	 */
	public void setRequestCache(RequestCache requestCache) {
		this.requestCache = requestCache;
	}
	
	
}
