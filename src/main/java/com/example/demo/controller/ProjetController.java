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
import com.example.demo.model.Projet;
import com.example.demo.service.ProjetService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProjetController {
@Autowired
	
	private ProjetService projetService;
	
	//ajouter projet
	
	 @PostMapping(path="/projet")
	 public Projet creerProjet(@Valid @RequestBody Projet newProjet)
	 {
	    return projetService.saveProjet(newProjet);
	  }
	 
	 //afficher projet
	 
	 @GetMapping(path="/projets")
		
		public List<Projet>getProjets()
		{
			return projetService.getProjets();
		}
	 
	 //modifier projet
	 
	 @PutMapping(path="/projet/{codeProjet}")
	 public Projet update(@PathVariable(name="codeProjet") String codeProjet,@RequestBody Projet g) 
	 {
		 g.setCodeProjet(codeProjet);
		 return projetService.updating(g);
}
	 //supprimer projet
	 
	 @DeleteMapping(path="/projet/{codeProjet}")
	 public void delete(@PathVariable(name="codeProjet") String codeProjet)
	 {
		 projetService.deleting(codeProjet);
	 }
	 
}
