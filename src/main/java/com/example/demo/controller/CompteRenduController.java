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
import com.example.demo.model.CompteRendu;
import com.example.demo.service.CompteRenduService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CompteRenduController {

@Autowired
	
	private CompteRenduService compteService;

//ajouter compteRendu

	 @PostMapping(path="/compteRendu")
	 public CompteRendu creerCompteRendu(@Valid @RequestBody CompteRendu newCompte)
	 {
	    return compteService.saveCompteRendu(newCompte);
	  }
	 
	 //afficher compteRendu
	 
	 @GetMapping(path="/compteRendus")
		
		public List<CompteRendu>getCompteRendus()
		{
			return compteService.getCompteRendus();
		}
	 
	 //modifier compteRendu
	 
	 @PutMapping(path="/compteRendu/{idCompteRendu}")
	 public CompteRendu update(@PathVariable(name="idCompteRendu") String idCompteRendu,@RequestBody CompteRendu g) 
	 {
		g.setIdCompteRendu(idCompteRendu);;
		 return compteService.updating(g);
}
	 //supprimer compteRendu
	 
	 @DeleteMapping(path="/compteRendu/{idCompteRendu}")
	 public void delete(@PathVariable(name="idCompteRendu") String idCompteRendu)
	 {
		 compteService.deleting(idCompteRendu);
	 }

}
