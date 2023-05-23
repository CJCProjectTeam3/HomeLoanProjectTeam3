package com.homeloan.main.serviceinterface;

import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.model.Ledger;

public interface LedgerServiceInterface {

	ApplicationFormData save(Ledger ledgerData, int applicantId);

}
