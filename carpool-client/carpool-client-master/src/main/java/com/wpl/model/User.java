package com.wpl.model;

import java.sql.Date;

public class User {
	
	private String userId;
	private String password;
	private String firstName;
	private String lastName;
	private String lastLogin;
	private String emailId;
	private Date birthDate;
	private int loginAttempts;
	
	public int getNoOfFailedAttempts() {
		return loginAttempts;
	}
	public void setNoOfFailedAttempts(int noOfFailedAttempts) {
		this.loginAttempts = noOfFailedAttempts;
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
	public String getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserId() {
		return userId;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
