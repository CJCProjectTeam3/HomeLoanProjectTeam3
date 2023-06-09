package com.homeloan.main.homeloanRepository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.main.model.EnquiryDetails;


@Repository
public interface EnquiryDetailsRepositry extends JpaRepository<EnquiryDetails, Integer> {

}
