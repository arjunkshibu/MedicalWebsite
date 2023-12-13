package com.example.medicalwebsite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicalwebsite.entity.DoctorEntity;
import com.example.medicalwebsite.repo.DoctorRepo;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepo doctorRepository;

    public List<DoctorEntity> getDoctor() {
        return doctorRepository.findAll();
    }

    public DoctorEntity addDoctor(DoctorEntity doctor) {
        return doctorRepository.save(doctor);
    }

    public void updateDoctor(DoctorEntity doctor) {
        doctorRepository.save(doctor);
    }

    public void deleteDoctor(int id) {
        doctorRepository.deleteById(id);
    }
}
