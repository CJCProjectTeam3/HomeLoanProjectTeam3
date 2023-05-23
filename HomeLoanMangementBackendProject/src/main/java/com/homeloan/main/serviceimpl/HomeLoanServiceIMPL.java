package com.homeloan.main.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.repository.HomeLoanRepositry;
import com.homeloan.main.serviceinterface.HomeLoanServiceInterface;

@Service
public class HomeLoanServiceIMPL implements HomeLoanServiceInterface{
	
	@Autowired
	HomeLoanRepositry hr;

	@Override
	public Optional<ApplicationFormData> findById(int applicationId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	

}
