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
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ApplicationFormData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int applicationId;
	private String applicantName;
	private String panNumber;
	private String adharNumber;
	private String applicationStatus;
	private String gender;
	private String age;
	private String address;
	private double applicantSalary;
	private double requirdLoanAmmount; 
	private int cibilScore;
	private String applicantEmail;
	
	@OneToOne (cascade = CascadeType.ALL)
	private Occupation occupation;
	
	@OneToOne (cascade = CascadeType.ALL)
	private BankAccountdetails bankAccountDetails;
	
	@OneToOne (cascade = CascadeType.ALL)
	private PersonalDocuments personalDoc;
	
	@OneToOne (cascade = CascadeType.ALL)
	private MortgageDocuments mortgageDocument;
	
	@OneToOne (cascade = CascadeType.ALL)
	private GuarantorDetails guarntorDetails;
	
	@OneToOne (cascade = CascadeType.ALL)
	private EMIDetails emiDetails;
	
// added this 
	@OneToOne (cascade = CascadeType.ALL)
	private SanctionLetter applicationsanctionLetter;
	

}

