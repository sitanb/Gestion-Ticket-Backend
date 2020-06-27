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

import com.example.demo.model.LigneProduit;

import com.example.demo.service.LigneProduitService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LigneProduitController {
@Autowired
	
	private LigneProduitService ligneProduitService;
//ajouter ligneProduit

	 @PostMapping(path="/ligneProduit")
	 public LigneProduit creerLigneProduit(@Valid @RequestBody LigneProduit newLigneProduit)
	 {
	    return ligneProduitService.saveLigneProduit(newLigneProduit);
	  }
	 
	 //afficher ligneProduit
	 
	 @GetMapping(path="/ligneProduits")
		
		public List<LigneProduit>getLigneProduits()
		{
			return ligneProduitService.getLigneProduits();
		}
	 
	 //modifier ligneProduit
	 
	 @PutMapping(path="/ligneProduit/{codePro}")
	 public LigneProduit update(@PathVariable(name="codePro") String codePro,@RequestBody LigneProduit g) 
	 {
		 g.setCodePro(codePro);
		 return ligneProduitService.updating(g);
}
	 //supprimer ligneProduit
	 
	 @DeleteMapping(path="/ligneProduit/{codePro}")
	 public void delete(@PathVariable(name="codePro") String codePro)
	 {
		ligneProduitService.deleting(codePro);
	 }
	 
	 @PutMapping(path="/ligneProduits/{codePro}/{raisonSoc}/{date}/{quantite}/{prixUnitaire}")
	 public void edit(@PathVariable(name="codePro") String codePro,@PathVariable(name="raisonSoc") String raisonSoc,@PathVariable(name="date") String date,@PathVariable(name="quantite") int quantite,@PathVariable(name="prixUnitaire") double prixUnitaire) 
	 {
		
		 ligneProduitService.editing(codePro, raisonSoc, date, quantite,prixUnitaire);
}
	 
	 @DeleteMapping(path="/ligneProduits/{codePro}/{raisonSoc}/{date}")
	 public void supp(@PathVariable(name="codePro") String codePro, @PathVariable(name = "raisonSoc") String raisonSoc, @PathVariable(name = "date") String date)
	 { 
		ligneProduitService.supprimer(codePro,raisonSoc,date);
	 }
	 
	

}
