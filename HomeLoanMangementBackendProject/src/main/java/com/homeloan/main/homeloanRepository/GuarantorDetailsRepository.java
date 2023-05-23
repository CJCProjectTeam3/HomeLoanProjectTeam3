package com.homeloan.main.homeloanRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.main.model.GuarantorDetails;

@Repository
public interface GuarantorDetailsRepository extends JpaRepository<GuarantorDetails, Integer> {

}
