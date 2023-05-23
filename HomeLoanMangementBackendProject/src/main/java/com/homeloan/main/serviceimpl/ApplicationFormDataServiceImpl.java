package com.homeloan.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.repository.ApplicationFormDataRepository;
import com.homeloan.main.serviceinterface.ApplicationFormDataInterface;

@Service
public class ApplicationFormDataServiceImpl implements ApplicationFormDataInterface {

	@Autowired
	ApplicationFormDataRepository appdatarepo;
	
	
	@Override
	public ApplicationFormData saveApplication(ApplicationFormData a) {

		return appdatarepo.save(a);
	}

	@Override
	public List<ApplicationFormData> getAllData() {

		return appdatarepo.findAll();
	}

}
