package com.homeloan.main.homeloanRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.main.model.ApplicationFormData;

@Repository
public interface ApplicationRepositry extends JpaRepository<ApplicationFormData, Integer>{

	

}
