package com.homeloan.main.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.main.model.ApplicationFormData;
import com.homeloan.main.model.EmailSender;
import com.homeloan.main.model.UserLoginDetails;
import com.homeloan.main.serviceinterface.EmailServiceInterface;
import com.homeloan.main.serviceinterface.HomeLoanServiceInterface;

@RestController
@CrossOrigin ("*")
@RequestMapping ("/mail")
public class EmailController 
{
	@Autowired
	EmailSender emailsender;
	
	@Autowired
	EmailServiceInterface emailserviceI;
	
	@Autowired
	HomeLoanServiceInterface hl;
	
	@Value ("${spring.mail.username}")
	private String from;
	
	@PostMapping ("/sendmail")
	public ResponseEntity<ApplicationFormData> sendMail(@RequestBody ApplicationFormData afdata)
	{
		System.out.println("cibil score" +afdata.getApplicationStatus());
		if(afdata.getApplicationStatus().equals("approved"))
		{
			emailsender.setFrom(from);
			emailsender.setTo(afdata.getApplicantEmail());
			emailsender.setSubject("Regarding Home Loan For Documentation of Applicant name: " + afdata.getApplicantName());
			emailsender.setMassege("Congratulations! We are pleased to inform you that based on your CIBIL score assessment, you are eligible for a loan with our institution.\n"		      
		      		+ "\n We are happy to inform you that your Home Loan request has been approved and is currently being processed.\n"
		      		+ "Further, we inform you that we have sent an email containing attached documents.\n"
		      		+ "Also we have sent you the terms and conditions of the loans sanctioned. \n"
		      		+ "We would like to schedule your meeting with the relationship manager of the company for any further information and clarifications that you might wish to know. \n\n"
		      		+ "We are happy to be working with you. \n\n"
		      		+ "List of Documents Required :- \n\n"
		      		+ "1.Aadhar Card \n"
		      		+ "2.Pan Card \n"
		      		+ "3.Income Tax Return of Last Two Years \n"
		      		+ "4.Salary Slips of Last Three Months \n"
		      		+ "5.Passport Size Photograph \n"
		      		+ "6.Bank Passbook Copy \n"		      	
		      		+ "Thank You Connecting With Us \n\n");
			
			emailserviceI.sendMail(emailsender);
			
//			ResponseEntity<ApplicationFormData> responseEntity= new ResponseEntity<ApplicationFormData>(200,"Mail Send Successfully for Approved Customer", afdata);
			
			return new ResponseEntity<ApplicationFormData>(HttpStatus.OK);
			
		}
		else {
			emailsender.setFrom(from);
			emailsender.setTo(afdata.getApplicantEmail());
			emailsender.setSubject("Regarding Car Loan For Documentation of Applicant name: " + afdata.getApplicantName());
			emailsender.setMassege("your cibil is Rejected and You are Not Eligible\n"
	        		+ "For Further Process."
	        		+ "\n We are Not Happy to inform you that your Home Loan request has been Rejected and is currently being Not Processed.\n"
	        		+ "Thank You Connecting With Us \n\n");
			
			emailserviceI.sendMail(emailsender);
			
			return new ResponseEntity<ApplicationFormData>(HttpStatus.OK);			
		}
	}
	
	@GetMapping ("/sendSanctionLetterMail/{applicationId}")
	public ResponseEntity<ApplicationFormData> sendSanctionLetterMail(@PathVariable("applicationId") int applicationId) throws Exception
	{
		System.out.println("Mail sending started");
		Optional<ApplicationFormData> applicationformdata = hl.findById(applicationId);
		
		ApplicationFormData applicationFormData= applicationformdata.get();
		if(applicationformdata.isPresent())
		{
			emailserviceI.sendSantionLetterMail(applicationFormData);
		}
		else {
			throw new Exception();
		}

		return new ResponseEntity<ApplicationFormData>(HttpStatus.OK);
		
	}
	
	
	
	
}
