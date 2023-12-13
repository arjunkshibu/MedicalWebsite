package com.example.medicalwebsite.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="doctors")
public class DoctorEntity {
		@Id
		private int id;
		private String docName;
		private String docHosp;
		private String docSpeciality;
		@Override
		public String toString() {
			return "DoctorEntity [id=" + id + ", docName=" + docName + ", docHosp=" + docHosp + ", docDept=" + docSpeciality
					+ "]";
		}
		public DoctorEntity(int id, String docName, String docHosp, String docDept) {
			super();
			this.id = id;
			this.docName = docName;
			this.docHosp = docHosp;
			this.docSpeciality = docDept;
		}
		public DoctorEntity() {
		    
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDocName() {
			return docName;
		}
		public void setDocName(String docName) {
			this.docName = docName;
		}
		public String getDocHosp() {
			return docHosp;
		}
		public void setDocHosp(String docHosp) {
			this.docHosp = docHosp;
		}
		public String getDocSpeciality() {
			return docSpeciality;
		}
		public void setDocSpeciality(String docDept) {
			this.docSpeciality = docDept;
		}
		
		
}

