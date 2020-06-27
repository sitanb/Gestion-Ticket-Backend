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

import com.example.demo.model.Societe;

import com.example.demo.service.SocieteService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")

public class SocieteController {
	@Autowired
	private SocieteService societeService;
	
	//ajouter societe

		 @PostMapping(path="/societe")
		 public Societe creerProduit(@Valid @RequestBody Societe newSociete)
		 {
		    return societeService.saveSociete(newSociete);
		  }
		 
		//afficher societe
		 
		 @GetMapping(path="/societes")
			
			public List<Societe>getSocietes()
			{
				return societeService.getSocietes();
			}
		 
		//modifier societe
		 
		 @PutMapping(path="/societe/{raisonSoc}")
		 public Societe update(@PathVariable(name="raisonSoc") String raisonSoc,@RequestBody Societe g) 
		 {
			g.setRaisonSoc(raisonSoc);
			 return societeService.updating(g);
	}
		 
//supprimer societe
		 
		 @DeleteMapping(path="/societe/{raisonSoc}")
		 public void delete(@PathVariable(name="raisonSoc") String raisonSoc)
		 {
			societeService.deleting(raisonSoc);
		 }

}
