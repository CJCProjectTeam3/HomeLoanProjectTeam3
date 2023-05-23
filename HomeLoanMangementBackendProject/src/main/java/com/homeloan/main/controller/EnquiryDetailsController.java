package com.homeloan.main.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.main.baseresponce.BaseResponce;
import com.homeloan.main.model.EnquiryDetails;
import com.homeloan.main.serviceinterface.EnquiryDetailsInterface;

@RestController
@CrossOrigin("*")
public class EnquiryDetailsController {

	@Autowired
	EnquiryDetailsInterface enquiryDetailsInterface;
	
	@PostMapping("/postEnquiryData")
	public ResponseEntity<BaseResponce<EnquiryDetails>> addEnquiryDetails(@RequestBody EnquiryDetails enquiryDetails)
	{
		EnquiryDetails enq=	enquiryDetailsInterface.save(enquiryDetails);
		BaseResponce<EnquiryDetails> baseEnuiry= new BaseResponce<EnquiryDetails>(200,new Date(),"Added EnquiryDetails Successfully....",enq);
		return new ResponseEntity<BaseResponce<EnquiryDetails>>(baseEnuiry,HttpStatus.OK);
	}
	
}
