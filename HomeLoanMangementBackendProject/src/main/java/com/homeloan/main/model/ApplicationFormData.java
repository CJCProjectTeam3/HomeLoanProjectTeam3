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
	private double applicantSalary;
	private long requirdLoanAmmount; 
	private int cibilScore;
	private String applicantEmail;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ApplicantAddress applicantAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
    private Occupation occupation;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PersonalDocuments personalDocuments; 
	
	@OneToOne(cascade = CascadeType.ALL)
	private MortgageDocuments mortgageDocuments;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CurrentLoanDetails currentLoanDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyInformation propertyInformation;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails guarantorDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoanDisbursementInfo loanDisbursementInfo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Ledger ledgerInfo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private SanctionLetter sanctionLetter ;
}