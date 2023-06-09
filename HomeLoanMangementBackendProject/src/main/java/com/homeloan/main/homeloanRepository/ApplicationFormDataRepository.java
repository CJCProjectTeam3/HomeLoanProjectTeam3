package com.homeloan.main.homeloanRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.main.model.ApplicationFormData;

@Repository
public interface ApplicationFormDataRepository extends JpaRepository<ApplicationFormData, Integer> {

}
