package com.homeloan.main.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.main.baseresponce.BaseResponce;
import com.homeloan.main.model.MortgageDocuments;
import com.homeloan.main.serviceinterface.MortgageDetailsInterface;

@RestController
@CrossOrigin("*")
public class MortgageDetailsController {
	
	@Autowired
	MortgageDetailsInterface mortgageInterface;

	@PostMapping("uploadMortgageDocument/{applicationId}")
	public ResponseEntity<BaseResponce<MortgageDocuments>> uploadMortgageDetails(@PathVariable int applicationId,@RequestBody MortgageDocuments mortgageDoc)
	{
		
		MortgageDocuments mortgageDetails=mortgageInterface.save(applicationId,mortgageDoc);
		BaseResponce<MortgageDocuments> baseResponce=new BaseResponce<>(200,new Date(),"Uplode MortgageDetails",mortgageDetails);
		return new ResponseEntity<BaseResponce<MortgageDocuments>>(baseResponce, HttpStatus.OK);
	}
}
