package com.homeloan.main.serviceImp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.main.homeloanRepository.HomeLoanRepositry;
import com.homeloan.main.model.ApplicationFormData;
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
