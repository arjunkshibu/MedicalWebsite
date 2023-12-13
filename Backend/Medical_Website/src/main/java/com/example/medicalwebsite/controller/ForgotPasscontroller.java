package com.example.medicalwebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicalwebsite.entity.ForgotPassEntity;
import com.example.medicalwebsite.service.ForgotService;
@RestController
public class ForgotPasscontroller {
	@Autowired
	private ForgotService ls;
	@GetMapping("/forgot") 
	public List<ForgotPassEntity> password(){
		return ls.getPassword();
	}
}
