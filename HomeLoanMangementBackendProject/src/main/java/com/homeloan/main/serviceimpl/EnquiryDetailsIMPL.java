package com.homeloan.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.main.homeloanRepository.EnquiryDetails;
import com.homeloan.main.homeloanRepository.EnquiryDetailsRepositry;
import com.homeloan.main.serviceinterface.EnquiryDetailsInterface;

@Service
public class EnquiryDetailsIMPL implements EnquiryDetailsInterface{

	@Autowired
	EnquiryDetailsRepositry enquiryDetailsRepositry;

	@Override
	public EnquiryDetails save(EnquiryDetails enquiryDetails) {
		
		return enquiryDetailsRepositry.save(enquiryDetails);
	}
}
