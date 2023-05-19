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
public class Ledger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ledgerId;
	private String emiStartDate;
	private double totalLoanAmount;
	private double emiAmount;
	private double remainingAmount;
	private String emiStatus;
	private String loanStatus;
	private String loanEndDate;
	private double payAmountwithIntrest;
	private String emiPaymentDate;

}
