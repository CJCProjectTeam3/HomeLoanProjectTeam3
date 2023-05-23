package com.homeloan.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.main.model.UserLoginDetails;

@Repository
public interface HomeLoanRepositry extends JpaRepository<UserLoginDetails, Integer> {

}
