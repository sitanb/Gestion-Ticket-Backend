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
import com.example.demo.model.Notification;
import com.example.demo.service.NotificationService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NotificationController {
@Autowired
	
	private NotificationService notService;

//ajouter notification

	 @PostMapping(path="/notification")
	 public Notification creerNotification(@Valid @RequestBody Notification newNot)
	 {
	    return notService.saveNotification(newNot);
	  }
	 
	 //afficher notification
	 
	 @GetMapping(path="/notifications")
		
		public List<Notification>getNotifications()
		{
			return notService.geNotifications();
		}
	 
	 //modifier notification
	 
	 @PutMapping(path="/notification/{idAss}/{codeProjet}/{etatNotification}")
	 public void supp(@PathVariable(name="idAss") String idAss, @PathVariable(name = "codeProjet") String codeProjet,@PathVariable(name = "etatNotification") String etatNotification)
	 { 
		 notService.miseajour(idAss, codeProjet, etatNotification);
	 }

	 //supprimer notification
	 
@DeleteMapping(path="/notification/{idAss}/{codeProjet}")
public void supp(@PathVariable(name="idAss") String idAss, @PathVariable(name = "codeProjet") String codeProjet)
{ 
	notService.supprimer(idAss, codeProjet);
}
}
