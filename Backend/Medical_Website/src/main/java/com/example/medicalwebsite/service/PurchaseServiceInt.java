package com.example.medicalwebsite.service;
import java.util.List;

import com.example.medicalwebsite.entity.*;

public interface PurchaseServiceInt {
	public List<PurchaseEntity> getPurchase();

	public void savePurchase(PurchaseEntity pe);
}
