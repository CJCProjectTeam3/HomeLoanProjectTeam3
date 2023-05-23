package com.homeloan.main.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.main.baseresponce.BaseResponce;
import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.model.LoanDisbursementInfo;
import com.homeloan.main.serviceinterface.LoanDisbursementServiceInterface;

@RestController
@CrossOrigin("*")
public class LoanDisbursementConteoller {
	
	@Autowired
	LoanDisbursementServiceInterface loanDisbursementServiceInterface;

    @PutMapping("uplodloanDisbursement/{applicatnId}")
    public ResponseEntity<BaseResponce<ApplicationFormData>> uplodeLoanDisbursement(@RequestBody LoanDisbursementInfo disursementData,@PathVariable int applicatnId)
    {
    	
    	ApplicationFormData loanDisbursment =loanDisbursementServiceInterface.save(applicatnId,disursementData);
    	BaseResponce<ApplicationFormData> baseResponce=new BaseResponce<ApplicationFormData>(200,new Date(),"Uplode LoanDisbursement Data",loanDisbursment);
		return new ResponseEntity<BaseResponce<ApplicationFormData>>(baseResponce, HttpStatus.OK);
    }
}
