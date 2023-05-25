package com.homeloan.main.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.main.baseresponce.BaseResponce;
import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.serviceinterface.ApplicationFormDataInterface;

@RestController
@CrossOrigin("*")
public class ApplicationFormDataController {

	@Autowired
	ApplicationFormDataInterface applicationinterface;
	
	@PostMapping("/submitApplication")
	public ResponseEntity<BaseResponce<ApplicationFormData>> postData(@RequestBody ApplicationFormData a){
		
		BaseResponce<ApplicationFormData> responce = new BaseResponce<ApplicationFormData>(200,new Date(),"application submitted successfully",applicationinterface.saveApplication(a));
		
		return new ResponseEntity<BaseResponce<ApplicationFormData>>(responce,HttpStatus.OK);
	}
	
	@GetMapping("/getApplicationData")
	public ResponseEntity<BaseResponce<List<ApplicationFormData>>> getData(){
		
		BaseResponce<List<ApplicationFormData>> responce = new BaseResponce<List<ApplicationFormData>>(200,new Date(),"Data Fetched successfully",applicationinterface.getAllData());
		
		return new ResponseEntity<BaseResponce<List<ApplicationFormData>>>(responce,HttpStatus.OK);
	}
	
	
}
