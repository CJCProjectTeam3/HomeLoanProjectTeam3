package com.homeloan.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.main.model.Admin;
import com.homeloan.main.serviceinterface.AdminServiceInterface;

@RestController
@CrossOrigin("*")
public class AdminController {

	@Autowired
	AdminServiceInterface adminservice;
	
	@GetMapping("/adminlogin/{adminUsername}/{adminPassword}/{adminType}")
	public Admin logincheck(@PathVariable String adminUsername, @PathVariable String adminPassword, @PathVariable String adminType) {
		
		return adminservice.login(adminUsername,adminPassword,adminType);
	}
	
//	admin controller 
}
