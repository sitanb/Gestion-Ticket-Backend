package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.SurAffectation;
import com.example.demo.service.SurAffectationService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SurAffectationController {

@Autowired
	
	private SurAffectationService surAffService;
//ajouter surAffectation

	 @PostMapping(path="/surAffectation")
	 public SurAffectation creerSurAffectation(@Valid @RequestBody SurAffectation newSurAff)
	 {
	    return surAffService.saveSurAffectation(newSurAff);
	  }
	 
	 //afficher surAffectation
	 
	 @GetMapping(path="/surAffectations")
		
		public List<SurAffectation>getSurAffectations()
		{
			return surAffService.getSurAffectations();
		}
	 
	 
	
	 
	
	 
	 @DeleteMapping(path="/surAffectations/{idAss}/{codeProjet}")
	 public void supp(@PathVariable(name="idAss") String idAss, @PathVariable(name = "codeProjet") String codeProjet)
	 { 
		 surAffService.supprimer(idAss,codeProjet);
	 }
}
