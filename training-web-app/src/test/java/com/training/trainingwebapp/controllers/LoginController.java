package com.training.trainingwebapp.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/login.html")
	public ModelAndView loginController() {
		
		//1. get username and password
		//2. Check that user exists - simulate a db call
		//3. if user exists and password is correct then allow user to go to home page
		// 		of if there is an error then notify the user that an error logging in has occurred
		
		Date dateAndTime = new Date();
		
		return new ModelAndView("login", "dateAndTime", dateAndTime);
		//return new ModelAndView("/WEB-INF/jsp/login.jsp", "dateAndTime", dateAndTime);
		
	}

}
