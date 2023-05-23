package com.homeloan.main.serviceinterface;

import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.model.LoanDisbursementInfo;

public interface LoanDisbursementServiceInterface {

	ApplicationFormData save(int applicatnId, LoanDisbursementInfo disursementData);

}
