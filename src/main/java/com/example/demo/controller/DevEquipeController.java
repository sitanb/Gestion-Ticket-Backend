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

import com.example.demo.model.DevEquipe;

import com.example.demo.service.DevEquipeService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DevEquipeController {
@Autowired
	
	private DevEquipeService devEquipeService;
//ajouter devEquipe

	 @PostMapping(path="/devEquipe")
	 public DevEquipe creerDevEquipe(@Valid @RequestBody DevEquipe newDevEquipe)
	 {
		 System.out.println(newDevEquipe);
	    return devEquipeService.saveDevEquipe(newDevEquipe);
	  }
	 
	
	 @PutMapping(path="/devequipes/{codeEquipe}/{idDev}/{etatSupp}")
	 public void supp(@PathVariable(name="codeEquipe") String codeEquipe, @PathVariable(name = "idDev") String idDev,@PathVariable(name = "etatSupp") String etatSupp)
	 { 
		devEquipeService.miseajour(codeEquipe, idDev, etatSupp);
	 }
	 //afficher devEquipe
	 
	 @GetMapping(path="/devEquipes")
		
		public List<DevEquipe>getDevEquipes()
		{
			return devEquipeService.getDevEquipes();
		}
	 
	 //supprimer devEquipe
	 
	 @DeleteMapping(path="/devequipe/")
	 public void delete(@Valid @RequestBody DevEquipe dev)
	 {
		 System.out.println(dev);
		 devEquipeService.deleting(dev);
	 }
	 
	 @DeleteMapping(path="/devequipes/{codeEquipe}/{idDev}")
	 public void supp(@PathVariable(name="codeEquipe") String codeEquipe, @PathVariable(name = "idDev") String idDev)
	 { 
		devEquipeService.supprimer(codeEquipe, idDev);
	 }
}
