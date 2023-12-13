package com.example.medicalwebsite.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ForgotPassEntity {
	private String email;
	@JsonIgnore
	private String password;
	@JsonIgnore
	private String newPassword;
	@Override
	public String toString() {
		return "MedicalForgotPassModel [email=" + email + ", password=" + password + ", newPassword=" + newPassword
				+ "]";
	}
	public ForgotPassEntity(String email, String password, String newPassword) {
		super();
		this.email = email;
		this.password = password;
		this.newPassword = newPassword;
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
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
}
