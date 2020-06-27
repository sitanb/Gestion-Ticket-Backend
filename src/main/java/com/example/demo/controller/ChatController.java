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

import com.example.demo.model.Chat;
import com.example.demo.service.ChatService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ChatController {

@Autowired
	
	private ChatService chatService;

//ajouter chat

	 @PostMapping(path="/chat")
	 public Chat creerChat(@Valid @RequestBody Chat newChat)
	 {
	    return chatService.saveChat(newChat);
	  }
	 
	 //afficher chat
	 
	 @GetMapping(path="/chats")
		
		public List<Chat>getChats()
		{
			return chatService.getChats();
		}
	 
	 //modifier chat
	 
	 @PutMapping(path="/chat/{nomUtil}")
	 public Chat update(@PathVariable(name="nomUtil") String nomUtil,@RequestBody Chat g) 
	 {
		g.setNomUtil(nomUtil);
		 return chatService.updating(g);
}
	 //supprimer chat
	 
	 @DeleteMapping(path="/chat/{nomUtil}")
	 public void delete(@PathVariable(name="nomUtil") String nomUtil)
	 {
		 chatService.deleting(nomUtil);
	 }
}
