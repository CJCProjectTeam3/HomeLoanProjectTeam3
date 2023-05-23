package com.homeloan.main.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.main.homeloanRepository.ApplicationRepositry;
import com.homeloan.main.homeloanRepository.LoanDisbursementRepositry;
import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.model.LoanDisbursementInfo;
import com.homeloan.main.serviceinterface.LoanDisbursementServiceInterface;

@Service
public class LoanDisbursementServiceIMPL implements LoanDisbursementServiceInterface{

	@Autowired
	ApplicationRepositry applicationRepositry;
	@Autowired
	LoanDisbursementRepositry loanDisbursementRepositry;
	@Override
	public ApplicationFormData save(int applicatnId, LoanDisbursementInfo disursementData) {
		Optional<ApplicationFormData> findById = applicationRepositry.findById(applicatnId);
		ApplicationFormData applicationFormData = findById.get();
		if(findById.isPresent())
		{
			applicationFormData.setApplicationId(applicatnId);
			applicationFormData.setLoanDisbursementInfo(disursementData);
			applicationRepositry.save(applicationFormData);
		}
		return applicationFormData;
	}

}
