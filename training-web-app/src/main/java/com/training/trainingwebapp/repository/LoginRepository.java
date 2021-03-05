package com.training.trainingwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.trainingwebapp.model.User;

@Repository
public interface LoginRepository extends JpaRepository<User, Long>{
	
	//Authenticate?
	
	
}
