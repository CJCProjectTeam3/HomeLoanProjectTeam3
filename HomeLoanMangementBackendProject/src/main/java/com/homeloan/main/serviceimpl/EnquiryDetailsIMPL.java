package com.homeloan.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.main.model.EnquiryDetails;
import com.homeloan.main.repository.EnquiryDetailsRepositry;
import com.homeloan.main.serviceinterface.EnquiryDetailsInterface;

@Service
public class EnquiryDetailsIMPL implements EnquiryDetailsInterface{

	@Autowired
	EnquiryDetailsRepositry enquiryDetailsRepositry;

	@Override
	public EnquiryDetails save(EnquiryDetails enquiryDetails) {
		
		return enquiryDetailsRepositry.save(enquiryDetails);
	}

	@Override
	public List<EnquiryDetails> getAllData() {

		return enquiryDetailsRepositry.findAll();
	}
}
