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
	private String age;
	private String panNumber;
	private long contact;//patch
	
	private String adharNumber;
	private String applicationStatus;
	private String gender;
	private double applicantSalary;
	private double requirdLoanAmmount; 
	private int cibilScore;
	private String applicantEmail;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ApplicantAddress applicantAddress;//RO
	
	@OneToOne(cascade = CascadeType.ALL)
    private Occupation occupation;//RM
	
	@OneToOne(cascade = CascadeType.ALL)
	private PersonalDocuments personalDocuments; //RM
	
	@OneToOne(cascade = CascadeType.ALL)
	private MortgageDocuments mortgageDocuments;//IO
	
	@OneToOne(cascade = CascadeType.ALL)
	private CurrentLoanDetails currentLoanDetails;//PO
	
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyInformation propertyInformation;//PO
	
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails guarantorDetails;//PO
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoanDisbursementInfo loanDisbursementInfo;//DO
	
	@OneToOne(cascade = CascadeType.ALL)
	private Ledger ledgerInfo;//DO
	
	@OneToOne(cascade = CascadeType.ALL)
	private SanctionLetter sanctionLetter ;//DO
	
	
}

