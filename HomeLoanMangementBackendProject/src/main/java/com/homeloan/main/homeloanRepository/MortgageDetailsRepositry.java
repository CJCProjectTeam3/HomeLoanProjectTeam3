package com.homeloan.main.homeloanRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.main.model.MortgageDocuments;

@Repository
public interface MortgageDetailsRepositry extends JpaRepository<MortgageDocuments, Integer>
{

}
