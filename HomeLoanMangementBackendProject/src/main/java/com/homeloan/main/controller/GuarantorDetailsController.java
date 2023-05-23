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
import com.homeloan.main.model.GuarantorDetails;
import com.homeloan.main.serviceinterface.GuarantorDetailsServiceInterface;

@RestController
@CrossOrigin("*")
public class GuarantorDetailsController {

	@Autowired
	GuarantorDetailsServiceInterface guarantorService;
	
	@PutMapping("/submitGuarantorDetails/{applicationId}")
	public ResponseEntity<BaseResponce<GuarantorDetails>> postGuarantor(@PathVariable int applicationId,
			@RequestBody GuarantorDetails guarantor){
		
		BaseResponce<GuarantorDetails> responce= new BaseResponce<GuarantorDetails>(200,new Date(),"Guarantor Details Added Successfully",guarantorService.saveData(applicationId,guarantor));
		
		return new ResponseEntity<BaseResponce<GuarantorDetails>>(responce,HttpStatus.OK);
	}
}
