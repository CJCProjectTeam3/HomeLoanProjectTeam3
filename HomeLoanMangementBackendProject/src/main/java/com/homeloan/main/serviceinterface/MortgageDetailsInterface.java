package com.homeloan.main.serviceinterface;

import com.homeloan.main.model.MortgageDocuments;

public interface MortgageDetailsInterface {

	MortgageDocuments save(int applicationId, MortgageDocuments mortgageDoc);

}
