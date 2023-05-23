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
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.main.baseresponce.BaseResponce;
import com.homeloan.main.model.PropertyInformation;
import com.homeloan.main.serviceinterface.PropertyInformationServiceInterface;

@RestController
@CrossOrigin("*")
public class PropertyInformationController {

	@Autowired
	PropertyInformationServiceInterface propertyService;
	
	@PutMapping("/submitPropertyInfo/{applicationId}")
	public ResponseEntity<BaseResponce<PropertyInformation>> postData(@PathVariable int applicationId,
			@RequestBody PropertyInformation property){
		
		BaseResponce<PropertyInformation> responce = new BaseResponce<PropertyInformation>(200,new Date(),"Property Information Added Successfully",propertyService.saveData(applicationId,property));
		
		return new ResponseEntity<BaseResponce<PropertyInformation>>(responce,HttpStatus.OK);
	}
}
