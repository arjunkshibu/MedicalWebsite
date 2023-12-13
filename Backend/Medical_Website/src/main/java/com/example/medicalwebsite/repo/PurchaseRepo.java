package com.example.medicalwebsite.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.medicalwebsite.entity.PurchaseEntity;

public interface PurchaseRepo extends JpaRepository<PurchaseEntity, Integer> {

}
