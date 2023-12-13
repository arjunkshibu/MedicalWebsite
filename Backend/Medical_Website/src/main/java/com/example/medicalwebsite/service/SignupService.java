package com.example.medicalwebsite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicalwebsite.entity.SignupEntity;
import com.example.medicalwebsite.repo.SignupRepo;

@Service
public class SignupService {

    @Autowired
    private SignupRepo signupRepository;

    public List<SignupEntity> getSignup() {
        return signupRepository.findAll();
    }

    public SignupEntity save(SignupEntity se) {
        return signupRepository.save(se);
    }

    public void delete(int id) {
        signupRepository.deleteById(id);
    }
}
