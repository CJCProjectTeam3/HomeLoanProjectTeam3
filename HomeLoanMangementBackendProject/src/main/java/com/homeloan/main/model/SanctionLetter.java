package com.homeloan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SanctionLetter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sanctionId;
	private String applicantName;
	private String sanctionDate;
	private double sanctionAmmount;
	private float intrestrate;
	private int loantenure;
	private double emiAmmount;
	private int accountId;
	private String accountHolderName;
	private long accountNumber;
	private String ifscCode;
	
//	added this
	private byte[] sanctionLetter;
	
	
	
}
