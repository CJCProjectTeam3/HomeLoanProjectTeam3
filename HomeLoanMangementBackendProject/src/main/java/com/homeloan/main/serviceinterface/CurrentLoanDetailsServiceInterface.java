package com.homeloan.main.serviceinterface;

import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.model.CurrentLoanDetails;

public interface CurrentLoanDetailsServiceInterface {

	ApplicationFormData save(CurrentLoanDetails loanDetails, int applicantId);

}
