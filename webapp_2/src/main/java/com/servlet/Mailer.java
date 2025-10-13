package com.servlet;

import java.util.Properties;
import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class Mailer {

    // 🌟 1. CHANGE THIS: Use your actual sending email address
    private static final String SENDER_EMAIL = "darshakgoswami122@gmail.com";
    // 🌟 2. CHANGE THIS: MUST BE A GMAIL APP PASSWORD
    private static final String SENDER_PASSWORD = "mzos juit ewhs fvut"; 

    public static void send(String to, String subject, String msg) {
        
    	// Alternative for Mailer.java (Use this if 587 fails)
    	Properties props = new Properties();
    	props.put("mail.smtp.host", "smtp.gmail.com");  
    	props.put("mail.smtp.port", "465");
    	props.put("mail.smtp.auth", "true");  
    	props.put("mail.smtp.ssl.enable", "true"); // Enable SSL for port 465
        // 2nd step) Create the mail Session with authentication
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
              return new PasswordAuthentication(SENDER_EMAIL, SENDER_PASSWORD);
            }
        });

        // 3rd step) Compose and Send the message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(SENDER_EMAIL));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(msg);

            Transport.send(message);

            System.out.println("Mail sent successfully to: " + to);
            
        } catch (MessagingException e) {  
            // *** IMPORTANT: Print the error for debugging, but don't stop registration ***
            System.err.println("!!! Mailer Error: Failed to send email to " + to + " !!!");
            e.printStackTrace(); 
            // We do NOT re-throw the exception here so the user can still register.
        }
    }
}