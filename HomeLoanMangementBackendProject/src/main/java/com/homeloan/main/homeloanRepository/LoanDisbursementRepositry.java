package com.homeloan.main.homeloanRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.main.model.LoanDisbursementInfo;

@Repository
public interface LoanDisbursementRepositry extends JpaRepository<LoanDisbursementInfo, Integer>{

}
