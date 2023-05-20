package com.homeloan.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.main.adminrepository.AdminRepository;
import com.homeloan.main.model.Admin;
import com.homeloan.main.serviceinterface.AdminServiceInterface;

@Service
public class AdminServiceImpl implements AdminServiceInterface {

	@Autowired
	AdminRepository adminrepo;
	
	@Override
	public Admin login(String adminUsername, String adminPassword, String adminType) {

		return adminrepo.findByAdminUsernameAndAdminPasswordAndAdminType(adminUsername,adminPassword,adminType);
	}
}
