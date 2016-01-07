package com.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.form.User;
import com.form.validator.UserValidator;
import com.spring.exceptions.CustomException;



@Controller
@RequestMapping("/register")
public class RegisterController {
	
	
	 	@RequestMapping(method = RequestMethod.GET)
	    public String viewRegistration(Map<String, Object> model) {
	        User userForm = new User();    
	        model.put("userForm", userForm);
	         
	        List<String> professionList = new ArrayList<String>();
	        professionList.add("Developer");
	        professionList.add("Designer");
	        professionList.add("IT Manager");
	        model.put("professionList", professionList);
	         
	        return "registration";
	    }
	     
	    @RequestMapping(method = RequestMethod.POST)
	    public String processRegistration(@ModelAttribute("userForm") @Validated User user,
	           BindingResult result, Map<String, Object> model) throws CustomException{
	         
	        // implement your own registration logic here...
	         if(result.hasErrors()){
	        	 throw new CustomException("This is a message from second controller");
	        	// return "registration";
	         }
	        // for testing purpose:
	        System.out.println("username: " + user.getUsername());
	        System.out.println("password: " + user.getPassword());
	        System.out.println("email: " + user.getEmail());
	        System.out.println("birth date: " + user.getBirthDate());
	        System.out.println("profession: " + user.getProfession());
	         
	        return "registrationsuccess";
	    }
	    
	    
	    @InitBinder("userForm")
		public void dataBinding(WebDataBinder binder) {
			binder.addValidators(new UserValidator());
		
	    }
	    
	    
	@RequestMapping(value = "/second", method = RequestMethod.GET)
	public ModelAndView second() throws CustomException {
		System.out.println("Throwing exception");
		throw new CustomException("This is a message from second controller");
	}
	
	
	@ExceptionHandler(CustomException.class)
	public ModelAndView handleCustomException(CustomException ex) {
		System.out.println("Handling exception");
		ModelAndView model = new ModelAndView("error");
		model.addObject("exception", ex);
		return model;

	}


}
