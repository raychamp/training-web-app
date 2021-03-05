package com.training.trainingwebapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TrainingSession {
	
	@Id
	private Long id;
	private String name;
	private Date completionDate;
	private String skill;
	private String type;
	

}
