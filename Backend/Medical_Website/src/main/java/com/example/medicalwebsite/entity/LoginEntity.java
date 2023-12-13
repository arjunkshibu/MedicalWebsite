package com.example.medicalwebsite.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LoginEntity {
	private String email;
	@JsonIgnore
	private String password;
	@Override
	public String toString() {
		return "WebsiteLoginModel [email=" + email + ", password=" + password + "]";
	}
	
	
	public LoginEntity(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
