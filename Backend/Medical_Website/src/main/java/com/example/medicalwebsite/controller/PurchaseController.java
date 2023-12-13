package com.example.medicalwebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicalwebsite.entity.PurchaseEntity;
import com.example.medicalwebsite.service.PurchaseService;

@RestController
public class PurchaseController {
	@Autowired
	private PurchaseService ss;
	@GetMapping("/purchase")
	public List<PurchaseEntity> purchase(){
		return ss.getPurchase();
	}
	@PostMapping("/purch")
	public String save(@RequestBody PurchaseEntity pe) {
		ss.savePurchase(pe);
		return "Data added Successfully";
	}
}
