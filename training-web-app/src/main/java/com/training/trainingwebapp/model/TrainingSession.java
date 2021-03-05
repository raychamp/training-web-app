package com.training.trainingwebapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table
public class TrainingSession {
	
	public TrainingSession() {}
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long id;
	private Date workoutDate;
	private String workoutDescription;
	private char completed;
	private String personalNotes;
	private String trainerNotes;
	private int eventNo;
	private int eventOrder;
	
	

}
