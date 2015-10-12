package com.keeplearn.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.keeplearn.model.Content;

public class ApplicationDataProviderInterceptor extends HandlerInterceptorAdapter {
	


	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
	
		int startIndex = 0;
		int endIndex = 5;
		
		/*modelAndView.addObject("Contents", contents);
		modelAndView.addObject("count",count);
		super.postHandle(request, response, handler, modelAndView);*/
	}
	

	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		return super.preHandle(request, response, handler);
	}
	
}
