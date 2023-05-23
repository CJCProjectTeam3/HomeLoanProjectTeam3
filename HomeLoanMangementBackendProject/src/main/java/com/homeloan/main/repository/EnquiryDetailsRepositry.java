package com.homeloan.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.main.model.EnquiryDetails;

@Repository
public interface EnquiryDetailsRepositry extends JpaRepository<EnquiryDetails, Integer> {

	
}
