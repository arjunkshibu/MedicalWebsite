package com.example.medicalwebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicalwebsite.entity.SignupEntity;
import com.example.medicalwebsite.service.SignupService;

@RestController
public class SignupController {
	@Autowired
	private SignupService ss;
	@GetMapping("/signup")
	public List<SignupEntity> signup(){
		return ss.getSignup();
	}
	@PostMapping("/post")
	public String post(@RequestBody SignupEntity se) {
		ss.save(se);
		return "Data has been added";
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam int id) {
		ss.delete(id);
		return "id "+id+" is deleted";
	}
}
