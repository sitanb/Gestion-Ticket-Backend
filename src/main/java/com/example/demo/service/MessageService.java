package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;

@Service
public class MessageService {
	@Autowired
	MessageRepository messageRep;
	public Message saveMessage(Message c) {
		
			return messageRep.save(c);
	}
	
	
	public List<Message> getMessages()
	{
		return messageRep.findAll();
	}
	
	
	
	
	public Message updating(Message g) 
	{
		if(messageRep.findById(g.getIdMsg())!=null)
		{
			
		return messageRep.save(g);
		}
		return null;
}
	
	public void deleting(Long idMsg)
	{
		messageRep.deleteById(idMsg);
	}
	
}
