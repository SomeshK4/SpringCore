package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {
	
	@RequestMapping("/welcome")
	public ModelAndView showMessage(){
		String message = "<br><div style='text-align:center;'>"
				+ "<h3> Hello, Spring MVC Demo</h3>This message is coming from MessageController.java</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}

}
