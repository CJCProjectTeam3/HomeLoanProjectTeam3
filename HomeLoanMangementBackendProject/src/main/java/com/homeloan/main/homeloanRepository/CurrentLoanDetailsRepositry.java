package com.homeloan.main.homeloanRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.main.model.CurrentLoanDetails;

@Repository
public interface CurrentLoanDetailsRepositry extends JpaRepository<CurrentLoanDetails, Integer> {

}
