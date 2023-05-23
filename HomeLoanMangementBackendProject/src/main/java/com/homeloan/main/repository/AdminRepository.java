package com.homeloan.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.main.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

	Admin findByAdminUsernameAndAdminPasswordAndAdminType(String adminUsername, String adminPassword, String adminType);

}
