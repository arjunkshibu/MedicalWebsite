package com.example.medicalwebsite.service;
import java.util.List;

import com.example.medicalwebsite.entity.*;

public interface SignupServiceInt {
	public List<SignupEntity> getSignup();

	public void save(SignupEntity se);

	public void delete(int id);
	
}
