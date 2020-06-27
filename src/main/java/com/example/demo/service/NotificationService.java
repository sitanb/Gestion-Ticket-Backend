package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Notification;
import com.example.demo.repository.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	NotificationRepository notiRep;
	
	public Notification saveNotification(Notification c) {
		
			return notiRep.save(c);
		
	}
	
	public List<Notification> geNotifications()
	{
		return notiRep.findAll();
	}
	

	public void supprimer(String idAss,String codeProjet)
	{
		
		notiRep.deleteUsingSingleQuery(idAss, codeProjet);;
	}
	
	public void miseajour(String idAss,String codeProjet,String etatNotification)
	{
		
		notiRep.updateUsingSingleQuery(idAss, codeProjet, etatNotification);
	}
	

	
}
