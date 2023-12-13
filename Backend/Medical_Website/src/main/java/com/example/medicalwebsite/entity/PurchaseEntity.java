package com.example.medicalwebsite.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="purchasemed")
public class PurchaseEntity {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;	
		private String medName;
		private double medPrice;
		private int strength;
		private String segment;
		private String consumedFor;
		private String dosage;
		private String BeforeorAfterFood;
		@Override
		public String toString() {
			return "MedicinePurchaseModel [id=" + id + ", medName=" + medName + ", medPrice=" + medPrice + ", strength=" + strength
					+ ", segment=" + segment + ", consumedFor=" + consumedFor + ", dosage=" + dosage
					+ ", BeforeorAfterFood=" + BeforeorAfterFood + "]";
		}
		public PurchaseEntity(String medName, double medPrice, int strength, String segment, String consumedFor,
				String dosage, String beforeorAfterFood) {
			super();
			this.medName = medName;
			this.medPrice = medPrice;
			this.strength = strength;
			this.segment = segment;
			this.consumedFor = consumedFor;
			this.dosage = dosage;
			this.BeforeorAfterFood = beforeorAfterFood;
		}
		
		public PurchaseEntity() {
			super();
		}
		public String getMedName() {
			return medName;
		}
		public void setMedName(String medName) {
			this.medName = medName;
		}
		public double getMedPrice() {
			return medPrice;
		}
		public void setMedPrice(double medPrice) {
			this.medPrice = medPrice;
		}
		public int getStrength() {
			return strength;
		}
		public void setStrength(int strength) {
			this.strength = strength;
		}
		public String getSegment() {
			return segment;
		}
		public void setSegment(String segment) {
			this.segment = segment;
		}
		public String getConsumedFor() {
			return consumedFor;
		}
		public void setConsumedFor(String consumedFor) {
			this.consumedFor = consumedFor;
		}
		public String getDosage() {
			return dosage;
		}
		public void setDosage(String dosage) {
			this.dosage = dosage;
		}
		public String getBeforeorAfterFood() {
			return BeforeorAfterFood;
		}
		public void setBeforeorAfterFood(String beforeorAfterFood) {
			this.BeforeorAfterFood = beforeorAfterFood;
		}
		
		
		
		

}