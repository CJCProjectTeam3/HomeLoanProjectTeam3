package com.homeloan.main.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.main.baseresponce.BaseResponce;
import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.model.CurrentLoanDetails;
import com.homeloan.main.model.MortgageDocuments;
import com.homeloan.main.serviceinterface.CurrentLoanDetailsServiceInterface;

@RestController
@CrossOrigin("*")
public class CurrentLoanDetailsController {

	@Autowired
	CurrentLoanDetailsServiceInterface CurrentLoanDetailsInterface;
	
	
	@PutMapping("uploadeCurrentLoanDetails/{applicantId}")
	public ResponseEntity<BaseResponce<ApplicationFormData>> uploadCurrentLoanDetails(@RequestBody CurrentLoanDetails loanDetails,@PathVariable int applicantId)
	{
		ApplicationFormData loandata= CurrentLoanDetailsInterface.save(loanDetails,applicantId);
		BaseResponce<ApplicationFormData> baseResponce=new BaseResponce<>(200,new Date(),"Uplode CurrentLoanDetails",loandata);
		return new ResponseEntity<BaseResponce<ApplicationFormData>>(baseResponce, HttpStatus.OK);
	}
}
