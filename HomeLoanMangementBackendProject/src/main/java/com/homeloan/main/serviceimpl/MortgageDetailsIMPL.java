package com.homeloan.main.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.main.homeloanRepository.ApplicationRepositry;
import com.homeloan.main.homeloanRepository.MortgageDetailsRepositry;
import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.model.MortgageDocuments;
import com.homeloan.main.serviceinterface.MortgageDetailsInterface;

@Service
public class MortgageDetailsIMPL implements MortgageDetailsInterface{
	
	@Autowired 
	MortgageDetailsRepositry mortgageRepositry;
	
	@Autowired
	ApplicationRepositry applicationRepositry;

	@Override
	public MortgageDocuments save(int applicationId, MortgageDocuments mortgageDoc) {
		
		Optional<ApplicationFormData> formExist = applicationRepositry.findById(applicationId);
		ApplicationFormData applicationFormData = formExist.get();
		if( formExist.isPresent())
		{
			
			applicationFormData.setApplicationId(applicationId);
			applicationFormData.setMortgageDocuments(mortgageDoc);
			applicationRepositry.save(applicationFormData);
		}
		return applicationFormData.getMortgageDocuments();
	}

}
