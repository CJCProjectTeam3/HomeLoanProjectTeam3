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
public class LoanDisbursementInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int disbursementId;
	private double firstInstallment;
	private double secondInstallment;
	private String  totalScantionAmount;
	private String disburseDate;
	

}
