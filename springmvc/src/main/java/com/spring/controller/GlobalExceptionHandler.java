package com.spring.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.spring.exceptions.CustomException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(CustomException.class)
	public ModelAndView handleCustomException(CustomException ex) {
		System.out.println("Handling exception in global exception handler");
		ModelAndView model = new ModelAndView("error");
		model.addObject("exception", ex);
		return model;

	}

}
