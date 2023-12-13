package com.example.medicalwebsite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicalwebsite.entity.PurchaseEntity;
import com.example.medicalwebsite.repo.PurchaseRepo;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepo purchaseRepository;

    public List<PurchaseEntity> getPurchase() {
        return purchaseRepository.findAll();
    }

    public void savePurchase(PurchaseEntity purchase) {
        purchaseRepository.save(purchase);
    }
}
