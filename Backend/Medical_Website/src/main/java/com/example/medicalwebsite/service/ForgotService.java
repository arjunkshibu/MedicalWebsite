package com.example.medicalwebsite.service;

import org.springframework.stereotype.Service;

import com.example.medicalwebsite.entity.ForgotPassEntity;

import java.util.List;
import java.util.ArrayList;

@Service
public class ForgotService implements ForgotServiceInt {
	public static List<ForgotPassEntity> ll = new ArrayList<>();
	static {
		ForgotPassEntity  lm = new ForgotPassEntity("abcd@gmail.com","12345678","12345678");
		ForgotPassEntity  lm1 = new ForgotPassEntity("abcdef@gmail.com","123456","123456");
		ForgotPassEntity  lm2 = new ForgotPassEntity("abcd@gmail.com","12345678","12345678");
		
		ll.add(lm);
		ll.add(lm1);
		ll.add(lm2);
		
	}
	@Override
	public List<ForgotPassEntity> getPassword(){
		return ll;
	}
}
