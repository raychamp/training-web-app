package com.training.trainingwebapp.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/login.html")
	public ModelAndView login() {
		
		Date dateAndTime = new Date();
		
		return new ModelAndView("login", "dateAndTime", dateAndTime);
		
		
		
	}

}
