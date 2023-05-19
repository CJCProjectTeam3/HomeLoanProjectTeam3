package com.homeloan.main.serviceinterface;

import java.util.Optional;

import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.model.UserLoginDetails;

public interface HomeLoanServiceInterface 
{
//	added this
	public Optional<ApplicationFormData> findById(int applicationId);

}
