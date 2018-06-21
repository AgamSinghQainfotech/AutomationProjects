package com.qainfotech.core;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailExamp {





	public void sendEmail(String headertabs) {      
		String to = "agamnarula50@gmail.com";//change accordingly   
		String from = "agamnarula50@gmail.com";       
		String host = "smtp.qainfotech.com";//or IP address           //Get the session object  

		Properties properties = System.getProperties();        
		properties.setProperty("mail.smtp.host", host);       
		Session session = Session.getDefaultInstance(properties);           //compose the message     
		try{            MimeMessage message = new MimeMessage(session);   
		message.setFrom(new InternetAddress(from));            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
		message.setSubject("Crypto Alerts");         
		message.setText(headertabs);               // Send message       
		Transport.send(message);          
		System.out.println("message sent successfully....");        
		}catch (MessagingException mex) {mex.printStackTrace();}      }
}
