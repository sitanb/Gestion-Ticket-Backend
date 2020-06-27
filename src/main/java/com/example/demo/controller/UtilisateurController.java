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

import com.example.demo.model.Utilisateur;

import com.example.demo.service.UtilisateurService;
@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")

public class UtilisateurController {
	
	@Autowired
	
	private UtilisateurService utilisateurService;
	
	//ajouter utilisateur
	
	 @PostMapping(path="/utilisateur")
	 public Utilisateur creerUtilisateur(@Valid @RequestBody Utilisateur newUtilisateur)
	 {
	    return utilisateurService.saveUtilisateur(newUtilisateur);
	  }
	 
	 //afficher utilisateur
	 
	 @GetMapping(path="/utilisateurs")
		
		public List<Utilisateur>getUtilisateurs()
		{
			return utilisateurService.getUtilisateurs();
		}
	 
	 //modifier utilisateur
	 
	 @PutMapping(path="/utilisateur/{nomUtil}")
	 public Utilisateur update(@PathVariable(name="nomUtil") String nomUtil,@RequestBody Utilisateur g) 
	 {
		 g.setNomUtil(nomUtil);
		 return utilisateurService.updating(g);
}
	 //supprimer utilisateur
	 
	 @DeleteMapping(path="/utilisateur/{nomUtil}")
	 public void delete(@PathVariable(name="nomUtil") String nomUtil)
	 {
		 utilisateurService.deleting(nomUtil);
		 
	 
}
}
