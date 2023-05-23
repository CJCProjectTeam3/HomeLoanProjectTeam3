package com.homeloan.main.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.main.baseresponce.BaseResponce;
import com.homeloan.main.model.Admin;
import com.homeloan.main.serviceinterface.AdminServiceInterface;

@RestController
@CrossOrigin("*")
public class AdminController {

	@Autowired
	AdminServiceInterface adminservice;
	
	@GetMapping("/adminlogin/{adminUsername}/{adminPassword}/{adminType}")
	public ResponseEntity<BaseResponce<Admin>> logincheck(@PathVariable String adminUsername, @PathVariable String adminPassword, @PathVariable String adminType) {
		
		BaseResponce<Admin> responce = new BaseResponce<Admin>(200,new Date(),"admin login successful",adminservice.login(adminUsername,adminPassword,adminType));
		
		return new ResponseEntity<BaseResponce<Admin>>(responce,HttpStatus.OK);
	}
}
