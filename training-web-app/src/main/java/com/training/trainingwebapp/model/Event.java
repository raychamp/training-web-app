package com.training.trainingwebapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
//@Table
//@RequestScoped
public class Event {
	
	public Event() {}
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long id;
	private String name;
	private Date completionDate;
	private String skill;
	private String type;
	

}
