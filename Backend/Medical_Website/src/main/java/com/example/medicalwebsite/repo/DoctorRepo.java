package com.example.medicalwebsite.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.medicalwebsite.entity.DoctorEntity;

public interface DoctorRepo extends JpaRepository<DoctorEntity, Integer> {
	

}
