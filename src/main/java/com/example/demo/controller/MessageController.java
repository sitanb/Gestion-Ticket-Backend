package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;
import com.example.demo.service.MessageService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MessageController {
@Autowired
	
	private MessageService messageService;
	

//ajouter message

	 @PostMapping(path="/message")
	 public Message creerMessage(@Valid @RequestBody Message newMessage)
	 {
	    return messageService.saveMessage(newMessage);
	  }
	 
	 //afficher message
	 
	 @GetMapping(path="/messages")
		
		public List<Message>getMessages()
		{
			return messageService.getMessages();
		}
	 

	 //modifier message
	 
	 @PutMapping(path="/message/{idMsg}")
	 public Message update(@PathVariable(name="idMsg") Long idMsg,@RequestBody Message g) 
	 {
		g.setIdMsg(idMsg);
		 return messageService.updating(g);
}
	 //supprimer message
	 
	 @DeleteMapping(path="/message/{idMsg}")
	 public void delete(@PathVariable(name="idMsg") Long idMsg)
	 {
		messageService.deleting(idMsg);
	 }
	 
}
