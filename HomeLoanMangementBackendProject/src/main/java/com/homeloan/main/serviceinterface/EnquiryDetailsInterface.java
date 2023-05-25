package com.homeloan.main.serviceinterface;

import java.util.List;

import com.homeloan.main.model.EnquiryDetails;

public interface EnquiryDetailsInterface {

	EnquiryDetails save(EnquiryDetails enquiryDetails);

	List<EnquiryDetails> getAllEnquiries();

}
