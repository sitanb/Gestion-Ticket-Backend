package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;
import com.example.demo.service.MailService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MailController {
	@Autowired
	private MailService mailService;
	@PostMapping(path="/mail/{toAdresse}/{fromAdresse}/{subject}/{content}")
	 public void envoyerMail(@PathVariable(name="toAdresse") String toAdresse,@PathVariable(name="fromAdresse") String fromAdresse,@PathVariable(name="subject") String subject,@PathVariable(name="content") String content) throws Exception 
	 {
		
		 mailService.send(toAdresse, fromAdresse, subject, content);
}
	 

}
