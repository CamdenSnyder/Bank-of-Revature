package com.example.demo.services.mail;

import com.example.demo.services.mail.sendmail.SendMail;

public class ResetPasswordEmail {
		public boolean SendMailForRestPassword(String email,String user_id)
		{
			String to = email;
			String link= "http://localhost:4200/forgotpassword/"+user_id;
			final String subject ="Password reset request from bank of revature";
			String messg ="<html>" +
					"<head><title>"+subject+"</title></head>" +
					"<body>" +
					"Click Here to <a href=\"" + link + "\"> reset password</a> "
					+"Or copy this link in your browser. "+link +
					"</body>" +
					"</html>";
			SendMail sm = new SendMail();
			if(sm.sendMail(to, messg, subject))
				return true;
			else
			return false;	
		}


}

