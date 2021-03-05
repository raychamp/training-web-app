package com.training.trainingwebapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.trainingwebapp.model.User;
import com.training.trainingwebapp.model.Vehicle;
import com.training.trainingwebapp.repository.LoginRepository;

@Controller
public class LoginController {
	
	@Autowired
	private LoginRepository loginRepo;
	
	@RequestMapping(value="/login.html", method=RequestMethod.GET)
	public ModelAndView login() {
		
		List<User> allUsers = loginRepo.findAll();	
		
		return new ModelAndView("login", "users", allUsers);
		
		
		
	}
	
//	@RequestMapping(value="/list.html", method=RequestMethod.GET)	
//	public ModelAndView vehicles()
//	{
//		List<Vehicle> allVehicles = data.findAll();
//		return new ModelAndView("allVehicles", "vehicles", allVehicles);
//	}

}
