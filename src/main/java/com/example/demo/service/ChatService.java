package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Chat;
import com.example.demo.repository.ChatRepository;

@Service
public class ChatService {
	@Autowired
	ChatRepository chatRep;
	public Chat saveChat(Chat c) {
		Chat g=chatRep.findBynomUtil(c.getNomUtil());
		if(g!=null)
			return null;
		else
			return chatRep.save(c);
	}
	public List<Chat> getChats()
	{
		return chatRep.findAll();
	}


	public Chat updating(Chat g) 
	{
		if(chatRep.findBynomUtil(g.getNomUtil())!=null)
		{
			
		return chatRep.save(g);
		}
		return null;
	}
	public void deleting(String nomUtil)
	{
		chatRep.deleteById(nomUtil);
	}

}
