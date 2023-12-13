package com.example.medicalwebsite.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="signup")
public class SignupEntity {

    @Id
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    @JsonIgnore
    private String password;
    @JsonIgnore
    private String confirmPassword;
	@Override
	public String toString() {
		return "SignupEntity [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}
	public SignupEntity(int id, String name, String address, String phoneNumber, String email, String password,
			String confirmPassword) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	public SignupEntity() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
    


}
