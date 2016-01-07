package com.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class RegisterInterceptor implements HandlerInterceptor{

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object object, Exception ex)
			throws Exception {
		System.out.println("GreetingInterceptor aftercompletion: REQUEST Intercepted for URI: "
				+ request.getRequestURI());
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object object, ModelAndView modelView) throws Exception {
		
		System.out.println("GreetingInterceptor postHandle: REQUEST Intercepted for URI: "
				+ request.getRequestURI());
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object object) throws Exception {
		System.out.println("GreetingInterceptor: REQUEST Intercepted for URI: "
				+ request.getRequestURI());
		request.setAttribute("greeting", "Happy Diwali!");
		return true;
	}

}
