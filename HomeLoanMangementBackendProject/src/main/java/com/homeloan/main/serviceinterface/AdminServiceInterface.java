package com.homeloan.main.serviceinterface;

import com.homeloan.main.model.Admin;

public interface AdminServiceInterface {

	Admin login(String adminUsername, String adminPassword, String adminType);

}
