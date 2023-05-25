package com.homeloan.main.serviceinterface;

import java.util.List;
import java.util.Optional;

import com.homeloan.main.model.EnquiryDetails;

public interface EnquiryDetailsInterface {

	public EnquiryDetails save(EnquiryDetails enquiryDetails);

	List<EnquiryDetails> getAllEnquries();

	Optional<EnquiryDetails> getEnquiry(int enquiryId);

}
