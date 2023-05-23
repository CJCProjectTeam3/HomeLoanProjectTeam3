package com.homeloan.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.main.model.PropertyInformation;

@Repository
public interface PropertyInformationRepository extends JpaRepository<PropertyInformation, Integer> {

}
