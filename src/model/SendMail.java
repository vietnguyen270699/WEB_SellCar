package model;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	public void sendMail(String to, String userName, String role) throws MessagingException {
		Properties p = new Properties();
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.starttls.enable", "true");
		p.put("mail.smtp.host", "smtp.gmail.com");
		p.put("mail.smtp.port", 587);
		// get Session
		Session s = Session.getInstance(p, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("phanvantinhpro@gmail.com", "loan20020414");
			}
		});
		Message msg = new MimeMessage(s);
		msg.setFrom(new InternetAddress("phanvantinhpro@gmail.com"));
		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		msg.setSubject("Confirm account from Fast Car store");
		msg.setContent("<i>Click to confirm your account:</i><br> http://localhost:8080/Chan/ConfirmAccount?username="+userName+"&"+"role="+role+"", "text/html");

		Transport.send(msg);
		System.out.println("send mail success!");
	}
//	public static void main(String[] args) throws MessagingException {
//		String to = "17130248@st.hcmuaf.edu.vn";
//		String userName = "tinhne";
//		String role = "12345";
//		SendMail sm = new SendMail();
//		sm.sendMail(to, userName, role);
//	}
}
