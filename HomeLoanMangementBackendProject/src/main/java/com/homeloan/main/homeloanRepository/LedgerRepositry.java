package com.homeloan.main.homeloanRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.main.model.Ledger;

@Repository
public interface LedgerRepositry extends JpaRepository<Ledger, Integer>{

}
