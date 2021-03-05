package com.training.trainingwebapp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Users {
	
	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private Date dob;
	private String sex;
	private String email;
	private String serviceLevel;
	private String userid;
	private String password;
	private boolean trainer;
	private List<Long> subscribedEventIds;
	private Long personalTrainerId;
	private List<TrainingSession> sessions;
	private boolean sessionInitialized = false;

}
