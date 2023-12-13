package com.example.medicalwebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicalwebsite.entity.LoginEntity;
import com.example.medicalwebsite.service.LoginService;
@RestController
public class LoginController {
@Autowired
private LoginService ls;
@GetMapping("/login")
public List<LoginEntity> login(){
	return ls.getLogin();
}
}
