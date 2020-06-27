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
import com.example.demo.model.Developpeur;
import com.example.demo.service.DeveloppeurService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DeveloppeurController {
@Autowired
	
	private DeveloppeurService developpeurService;
	
	//ajouter developpeur
	
	 @PostMapping(path="/developpeur")
	 public Developpeur creerDeveloppeur(@Valid @RequestBody Developpeur newDeveloppeur)
	 {
	    return developpeurService.saveDeveloppeur(newDeveloppeur);
	  }
	 
	 //afficher developpeur
	 
	 @GetMapping(path="/developpeurs")
		
		public List<Developpeur>getDeveloppeurs()
		{
			return developpeurService.getDeveloppeurs();
		}
	 
	 //modifier developpeur
	 
	 @PutMapping(path="/developpeur/{idDev}")
	 public Developpeur update(@PathVariable(name="idDev") String idDev,@RequestBody Developpeur g) 
	 {
		g.setIdDev(idDev);
		 return developpeurService.updating(g);
}
	 //supprimer developpeur
	 
	 @DeleteMapping(path="/developpeur/{idDev}")
	 public void delete(@PathVariable(name="idDev") String idDev)
	 {
		 developpeurService.deleting(idDev);
	 }
	 
}
