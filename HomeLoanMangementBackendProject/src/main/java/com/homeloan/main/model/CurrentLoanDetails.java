package com.homeloan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CurrentLoanDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int currentloanId;
	private int currentloanNo;
	private double loanAmount;
	private float rateOfInterest;
	private int tenure;
	private double totalAmounttobepaidDouble;
	private float totalInterest;
	private String sanctionDate;
	private String remark;
	private String status;
	
	@OneToOne(cascade =CascadeType.ALL )
	private EMIDetails Emidetails;

}
