package com.homeloan.main.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.model.PropertyInformation;
import com.homeloan.main.repository.ApplicationFormDataRepository;
import com.homeloan.main.serviceinterface.PropertyInformationServiceInterface;

@Service
public class PropertyInformationServiceIMPL implements PropertyInformationServiceInterface {
	
	@Autowired
	ApplicationFormDataRepository applicationRepo;

	@Override
	public PropertyInformation saveData(int applicationId, PropertyInformation property) {

		Optional<ApplicationFormData> findById = applicationRepo.findById(applicationId);
		
		if(findById.isPresent()) {
			ApplicationFormData data = findById.get();
			data.setApplicationId(applicationId);
			data.setPropertyInformation(property);
			applicationRepo.save(data);
		}
		
		return null;
	}

}
