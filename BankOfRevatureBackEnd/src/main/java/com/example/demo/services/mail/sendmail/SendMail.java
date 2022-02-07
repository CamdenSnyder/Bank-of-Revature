package com.example.demo.services.mail.sendmail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	
	
	public boolean sendMail(String to,String msg,String subject)
	{
		//https://myaccount.google.com/security
	    // Sender's email ID and password needs to be mentioned
		Password password = new Password();
	    final String from = "bankofrevature@gmail.com";
	    final String pass =password.getPassword();
	    
	    // Defining the gmail host
	    
	    String host = "smtp.gmail.com";
	    
	    // Creating Properties object
	    Properties props = new Properties();    
	      props.put("mail.smtp.host", "smtp.gmail.com");    
	      props.put("mail.smtp.port", "587");    
	      props.put("mail.transport.protocol", "smtp");
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	      props.put("mail.smtp.ssl.protocols", "TLSv1.2");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.user", from);
	      props.put("mail.password", pass);
	      props.put("mail.port", "587");

	      // Authorized the Session object.

	      Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {

	          @Override
	          protected PasswordAuthentication getPasswordAuthentication() {
	              return new PasswordAuthentication(from, pass);
	          }
	      });
	      try {
	          // Create a default MimeMessage object.
	          MimeMessage message = new MimeMessage(mailSession);
	          // Set From: header field of the header.
	          message.setFrom(new InternetAddress(from));
	          // Set To: header field of the header.
	          message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
	          message.setSubject(subject);
	          message.setContent(
	                  msg,
	                 "text/html; charset=utf-8");
	          Transport.send(message);
	          return true;

	      } catch (MessagingException mex) {return false;}
	}
}
