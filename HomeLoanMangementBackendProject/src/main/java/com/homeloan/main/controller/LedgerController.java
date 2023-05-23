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
import com.homeloan.main.model.Ledger;
import com.homeloan.main.serviceinterface.LedgerServiceInterface;

@RestController
@CrossOrigin("*")
public class LedgerController {

	@Autowired
	LedgerServiceInterface ledgerServiceInterface;
	@PutMapping("uplodLedgerDetails/{applicantId}")
	public ResponseEntity<BaseResponce<ApplicationFormData>> uplodLedgerDetails(@RequestBody Ledger ledgerData ,@PathVariable int applicantId)
	{
		ApplicationFormData loandata= ledgerServiceInterface.save(ledgerData,applicantId);
		BaseResponce<ApplicationFormData> baseResponce=new BaseResponce<>(200,new Date(),"Uplode LedgerDetails",loandata);
		return new ResponseEntity<BaseResponce<ApplicationFormData>>(baseResponce, HttpStatus.OK);
	}
	
}
