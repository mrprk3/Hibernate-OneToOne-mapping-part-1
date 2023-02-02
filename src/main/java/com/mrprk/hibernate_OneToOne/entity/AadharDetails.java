package com.mrprk.hibernate_OneToOne.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="AadherDetails")
public class AadharDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="aadhar_id")
	private int aadharId;

	@Column(name="aadhar_number")
	private String aadharCardNumber;

	public int getAadharId() {
		return aadharId;
	}

	public void setAadharId(int aadharId) {
		this.aadharId = aadharId;
	}

	public String getAadharCardNumber() {
		return aadharCardNumber;
	}

	public void setAadharCardNumber(String aadharCardNumber) {
		this.aadharCardNumber = aadharCardNumber;
	}

	public AadharDetails(int aadharId, String aadharCardNumber) {
		super();
		this.aadharId = aadharId;
		this.aadharCardNumber = aadharCardNumber;
	}

	public AadharDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AadharDetails [aadharId=" + aadharId + ", aadharCardNumber=" + aadharCardNumber + "]";
	}
	
	
	

}
