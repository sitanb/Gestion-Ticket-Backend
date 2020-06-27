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

import com.example.demo.model.Inscription;
import com.example.demo.service.InscriptionService;


@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")

public class InscriptionController {
@Autowired
	
	private InscriptionService  inscriptionService;
//ajouter inscription

	 @PostMapping(path="/inscription")
	 public Inscription creerInscription(@Valid @RequestBody Inscription newInscription)
	 {
	    return inscriptionService.saveInscription(newInscription);
	  }
	 
	//afficher inscription
	 
		 @GetMapping(path="/inscriptions")
			
			public List<Inscription>getInscriptions()
			{
				return inscriptionService.getInscriptions();
			}
		//modifier inscription
		 
		 @PutMapping(path="/inscription/{nomUtil}")
		 public Inscription update(@PathVariable(name="nomUtil") String nomUtil,@RequestBody Inscription g) 
		 {
			g.setNomUtil(nomUtil);
			 return inscriptionService.updating(g);
	}
		//supprimer inscription
		 
		 @DeleteMapping(path="/inscription/{nomUtil}")
		 public void delete(@PathVariable(name="nomUtil") String nomUtil)
		 {
			inscriptionService.deleting(nomUtil);
		 }
		 
}
