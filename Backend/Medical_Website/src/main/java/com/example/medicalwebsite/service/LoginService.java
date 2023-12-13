package com.example.medicalwebsite.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.medicalwebsite.entity.LoginEntity;
@Service
public class LoginService implements LoginServiceInt {
	private static List<LoginEntity> ll = new ArrayList<>();
	static {
		LoginEntity lm = new LoginEntity("abcd@gmail.com","123456");
		LoginEntity lm1 = new LoginEntity("abc@gmail.com","1234567");
		LoginEntity lm2 = new LoginEntity("abcde@gmail.com","1234568");
		
		ll.add(lm);
		ll.add(lm1);
		ll.add(lm2);
	}
	@Override
	public List<LoginEntity> getLogin(){
		return ll;
	}
}
