package com.homeloan.main.serviceinterface;

import com.homeloan.main.model.GuarantorDetails;

public interface GuarantorDetailsServiceInterface {

	GuarantorDetails saveData(int applicationId, GuarantorDetails guarantor);
}
