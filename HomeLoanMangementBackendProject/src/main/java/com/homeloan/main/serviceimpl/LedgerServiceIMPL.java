package com.homeloan.main.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.main.homeloanRepository.ApplicationRepositry;
import com.homeloan.main.homeloanRepository.LedgerRepositry;
import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.model.Ledger;
import com.homeloan.main.serviceinterface.LedgerServiceInterface;

@Service
public class LedgerServiceIMPL implements LedgerServiceInterface {

	@Autowired
	ApplicationRepositry applicationRepositry;
	@Autowired
	LedgerRepositry ledgerRepositry;
	@Override
	public ApplicationFormData save(Ledger ledgerData, int applicantId) {
		Optional<ApplicationFormData> findById = applicationRepositry.findById(applicantId);
		ApplicationFormData applicationFormData = findById.get();
		if(findById.isPresent())
		{
			applicationFormData.setApplicationId(applicantId);
			applicationFormData.setLedgerInfo(ledgerData);
			applicationRepositry.save(applicationFormData);
		}
		return applicationFormData;
	}

}
