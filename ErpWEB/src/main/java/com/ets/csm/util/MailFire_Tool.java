package com.ets.csm.util;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;


/**
 * @author Pradipto Roy
 *
 */
public class MailFire_Tool {
	@Autowired
     static	JavaMailSender javaMailSender;
	 
	private static String host="njdz6.dailyrazor.com";
	private static String user="webmaster@ets-techteam.com";
	private static String password="aW4ZKyhGe7[L";
  
 
	public static int EmailSender(String toemailid,String cc_emauilid,String subject,String content)
	{
		int i=0;
		try
		{
			    String to=toemailid;//change accordingly  
			  
			   //Get the session object  
			    Properties props = new Properties();  
			    props.put("mail.smtp.host",host);  
			    props.put("mail.smtp.auth", "true");  
			     
			    Session session = Session.getDefaultInstance(props,  
			    new javax.mail.Authenticator() 
			    {  
			    protected PasswordAuthentication getPasswordAuthentication() 
			    {  
			    return new PasswordAuthentication(user,password);  
			    }  
			    }); 
			    
			 Transport transport = session.getTransport();
			
		     MimeMessage message = new MimeMessage(session);  
		     message.setFrom(new InternetAddress(user));  
//		     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
		     message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toemailid));
		     message.setSubject(subject);  
		     message.setText(content);  
		     transport.connect();
		     transport.sendMessage(message,message.getRecipients(Message.RecipientType.TO));
		     
		    //send the message  
		     transport.close();
		     
		     System.out.println("message sent successfully...");  
		     i=1;
		     
		}
		catch(Exception e)
		{
			i=0;
		System.out.println("Exception occur "+e);	
		}
		
		return i;
	}
	
	}
	