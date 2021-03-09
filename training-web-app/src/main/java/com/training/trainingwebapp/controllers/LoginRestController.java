package com.training.trainingwebapp.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.trainingwebapp.model.UserDTO;
import com.training.trainingwebapp.repository.LoginJpaRepository;

@RestController
@RequestMapping("/trainingwebapp/login")
public class LoginRestController {
	
	public static final Logger logger = LoggerFactory.getLogger(LoginRestController.class);
	
	
	private LoginJpaRepository loginJpaRepository;
	
	@Autowired
	public void setLoginJpaRepository(LoginJpaRepository loginJpaRepository) {
		
		logger.info("In setter method");
		this.loginJpaRepository = loginJpaRepository;
	}
	
@GetMapping("/")
public ResponseEntity<List<UserDTO>> listAllUsers(){
	List<UserDTO> users = loginJpaRepository.findAll();
	return new ResponseEntity<List<UserDTO>>(users, HttpStatus.OK);
}

@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<UserDTO> createUser(@RequestBody final UserDTO user) {
	
	logger.info("In createUser method");
	
	loginJpaRepository.save(user);
	return new ResponseEntity<UserDTO>(user, HttpStatus.CREATED);
}

@GetMapping("/{id}")
public ResponseEntity<UserDTO> getUserById(@PathVariable("id") final Long id){
	Optional<UserDTO> userOptional = loginJpaRepository.findById(id);
	UserDTO  user = userOptional.get();
	return new ResponseEntity<UserDTO>(user, HttpStatus.OK);
}

@PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<UserDTO> updateUser(@PathVariable("id") final Long id, @RequestBody UserDTO user) {
	//feth user based on id and set it to the currentuser object of type UserSTO
	Optional<UserDTO> userOptional = loginJpaRepository.findById(id);
	UserDTO currentUser = userOptional.get();
	
	
	//update currentUser object
	currentUser.setDob(user.getDob());
	currentUser.setEmail(user.getEmail());
	currentUser.setFirstName(user.getFirstName());
	currentUser.setLastName(user.getLastName());
	currentUser.setPassword(user.getPassword());
	currentUser.setServiceLevel(user.getServiceLevel());
	currentUser.setSessionInitialized(user.getSessionInitialized());
	currentUser.setSex(user.getSex());
	currentUser.setTrainer(user.getTrainer());
	currentUser.setUserid(user.getUserid());
	
	//save currentUser object
	loginJpaRepository.saveAndFlush(currentUser);
	
	//return new REsonseEntity object
	return new ResponseEntity<UserDTO>(currentUser, HttpStatus.OK);
	
}
		
}

