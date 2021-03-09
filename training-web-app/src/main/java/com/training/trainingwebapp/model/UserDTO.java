package com.training.trainingwebapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="User")
public class UserDTO implements Serializable{
	
	/**
	 *  Data Transfer Object - DTO
	 */
	private static final long serialVersionUID = 1L;

	public UserDTO() {};
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="SEX")
	private String sex;
	@Column(name="DOB")
	private String dob;
	@Column(name="EMAIL")
	private String email;
	@Column(name="SERVICE_LEVEL")
	private String serviceLevel;
	@Column(name="USERID")
	private String userid;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="TRAINER")
	private String trainer;
	@Column(name="SESSION_INITIALIZED")
	private String sessionInitialized;
		
	@Override
	public String toString() {
		return "Users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", sex=" + sex
				+ ", serviceLevel=" + serviceLevel + ", trainer=" + trainer + "]";
	}
	
	
	
	public UserDTO(Long id, String firstName, String lastName, String sex, String dob, String email,
			String serviceLevel, String userid, String password, String trainer, String sessionInitialized) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.dob = dob;
		this.email = email;
		this.serviceLevel = serviceLevel;
		this.userid = userid;
		this.password = password;
		this.trainer = trainer;
		this.sessionInitialized = sessionInitialized;
	}



	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public String getSessionInitialized() {
		return sessionInitialized;
	}

	public void setSessionInitialized(String sessionInitialized) {
		this.sessionInitialized = sessionInitialized;
	}

	public Long getId() {
		return id;
	}
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getServiceLevel() {
		return serviceLevel;
	}
	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
