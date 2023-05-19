package com.homeloan.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.main.serviceinterface.HomeLoanServiceInterface;
import com.homeloan.main.model.*;

@RestController
@CrossOrigin("*")
public class HomeLoanController 
{
	
	@Autowired
	HomeLoanServiceInterface hi;
	
	
//	public ResponseEntity<BaseResponse<ApplicationFromData>> post()
//	{
//		
//	}
	

}
