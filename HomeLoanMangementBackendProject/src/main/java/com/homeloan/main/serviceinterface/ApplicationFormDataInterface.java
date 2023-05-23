package com.homeloan.main.serviceinterface;

import java.util.List;

import com.homeloan.main.model.ApplicationFormData;

public interface ApplicationFormDataInterface {

	ApplicationFormData saveApplication(ApplicationFormData a);

	List<ApplicationFormData> getAllData();

}
