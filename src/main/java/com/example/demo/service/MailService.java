package com.example.demo.service;

import java.util.Date;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
@Service
public class MailService {
	private JavaMailSender javaMailSender;
	
	@Autowired
	public MailService(JavaMailSender javaMailSender) {
		super();
		this.javaMailSender = javaMailSender;
	}
public void send(String toAdresse, String fromAdresse, String subject, String content) throws Exception{
		SimpleMailMessage  mimeMessage=new SimpleMailMessage();
		mimeMessage.setFrom(fromAdresse);
		mimeMessage.setSubject(subject);
		mimeMessage.setTo(toAdresse);
		mimeMessage.setText(content);
		mimeMessage.setSentDate(new Date());
		javaMailSender.send(mimeMessage);
		
		
	}
	
}
