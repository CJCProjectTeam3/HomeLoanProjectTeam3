package com.homeloan.main.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.main.homeloanRepository.ApplicationRepositry;
import com.homeloan.main.homeloanRepository.CurrentLoanDetailsRepositry;
import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.model.CurrentLoanDetails;
import com.homeloan.main.serviceinterface.CurrentLoanDetailsServiceInterface;

@Service
public class CurrentLoanDetailsServiceIMPL implements CurrentLoanDetailsServiceInterface {

	@Autowired
	CurrentLoanDetailsRepositry currentLoanDetailsRepo;

	@Autowired
	ApplicationRepositry applicationRepositry;

	@Override
	public ApplicationFormData save(CurrentLoanDetails loanDetails, int applicantId) {

		Optional<ApplicationFormData> findById = applicationRepositry.findById(applicantId);
		ApplicationFormData applicationFormData = findById.get();
		if (findById.isPresent()) {
			applicationFormData.setApplicationId(applicantId);
			applicationFormData.setCurrentLoanDetails(loanDetails);
			System.out.println(loanDetails.getEmidetails());
			applicationRepositry.save(applicationFormData);
		}
		return applicationFormData;
	}
}
