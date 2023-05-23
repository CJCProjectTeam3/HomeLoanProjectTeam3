package com.homeloan.main.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.model.GuarantorDetails;
import com.homeloan.main.serviceinterface.GuarantorDetailsServiceInterface;

@Service
public class GuarantorDetailsServiceIMPL implements GuarantorDetailsServiceInterface {
	
	@Autowired
	com.homeloan.main.homeloanRepository.ApplicationFormDataRepository applicationRepo;

	@Override
	public GuarantorDetails saveData(int applicationId, GuarantorDetails guarantor) {

		Optional<ApplicationFormData> findById = applicationRepo.findById(applicationId);
		
		if(findById.isPresent()) {
			ApplicationFormData details = findById.get();
			details.setApplicationId(applicationId);
			details.setGuarantorDetails(guarantor);
			applicationRepo.save(details);
		}
		return null;
	}
}