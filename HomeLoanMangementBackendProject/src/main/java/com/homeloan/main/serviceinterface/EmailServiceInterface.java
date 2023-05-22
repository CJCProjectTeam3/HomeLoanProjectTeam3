package com.homeloan.main.serviceinterface;

import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.model.EmailSender;
import com.homeloan.main.model.SanctionLetter;
import com.homeloan.main.model.UserLoginDetails;

public interface EmailServiceInterface 
{
	public void sendMail(EmailSender e);
	
	//public SanctionLetter sendSantionLetterMail(ApplicationFormData applicationFormData);
}
