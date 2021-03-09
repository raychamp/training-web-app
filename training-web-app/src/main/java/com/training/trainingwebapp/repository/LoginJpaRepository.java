package com.training.trainingwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.trainingwebapp.model.UserDTO;

@Repository
public interface LoginJpaRepository extends JpaRepository<UserDTO, Long>{
	
//	//Should only be one unique userid
//	UserDTO findByUserid(String userid, String password);
//	
	
}
