package com.homeloan.main.serviceImp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.homeloan.main.model.EmailSender;
import com.homeloan.main.serviceinterface.EmailServiceInterface;

@Service
public class EmailServiceImpl implements EmailServiceInterface 
{
	@Autowired
	JavaMailSender sender;
	
	@Override
	public void sendMail(EmailSender e) 
	{
		try {
			SimpleMailMessage message=new SimpleMailMessage();
			message.setTo(e.getTo());
			message.setFrom(e.getFrom());
			message.setSubject(e.getSubject());
			message.setText(e.getMassege());
			
			sender.send(message);
		} 
		catch (MailException e1) 
		{
			System.out.println("Email Failed to Send");
			e1.printStackTrace();
		}
		
	}
	
//	@Value ("${spring.mail.username}")
//	private String from;
//	

//	@Override
//	public SanctionLetter sendSantionLetterMail(ApplicationFormData applicationFormData)
//	{
//		MimeMessage mimeMessage= sender.createMimeMessage();
//		
//		byte[] sanctionLetter= applicationFormData.getApplicationsanctionLetter().getSanctionLetter();
//		
//		try {
//			MimeMessageHelper mimeMessageHelper =new MimeMessageHelper(mimeMessage, true);
//			mimeMessageHelper.setFrom(from);
//			mimeMessageHelper.setTo(applicationFormData.getApplicantEmail());
//			mimeMessageHelper.setSubject("Finance Company Sanction Letter");
//			
//			String text= "Dear " + applicationFormData.getApplicantName()
//			+ ",\n" + "\n"
//			+ "This letter is to inform you that we have reviewed your request for a credit loan . We are pleased to offer you a credit loan of "
//			+ applicationFormData.getApplicationsanctionLetter().getSanctionAmmount() + " for "
//			+ applicationFormData.getApplicationsanctionLetter().getLoantenure() + ".\n" + "\n"
//			+ "We are confident that you will manage your credit loan responsibly, and we look forward to your continued business.\n"
//			+ "\n"
//			+ "Should you have any questions about your credit loan, please do not hesitate to contact us.\n"
//			+ "\n" + "Thank you for your interest in our services.";
//			
//			mimeMessageHelper.setText(text);
//			
//			mimeMessageHelper.addAttachment("loanSanctionLetter.pdf", new ByteArrayResource(sanctionLetter));
//			
//			sender.send(mimeMessage);
//		} 
//		catch (Exception e) 
//		{
//			System.out.println("Email Failed to Send!!!!!!");
//			e.printStackTrace();
//		}
//		return null;
//	}

}

