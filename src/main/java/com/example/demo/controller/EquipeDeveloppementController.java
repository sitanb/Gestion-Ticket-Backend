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

import com.example.demo.model.EquipeDeveloppement;

import com.example.demo.service.EquipeDeveloppementService;


@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EquipeDeveloppementController {
@Autowired
	
	private EquipeDeveloppementService equipeDevService;
	
	//ajouter equipeDeveloppement
	
	 @PostMapping(path="/equipeDeveloppement")
	 public EquipeDeveloppement creerEquipeDeveloppement(@Valid @RequestBody EquipeDeveloppement newEquipeDeveloppement)
	 {
	    return equipeDevService.saveEquipeDeveloppement(newEquipeDeveloppement);
	 }
	 
	 //afficher equipeDeveloppement
	 
	 @GetMapping(path="/equipeDeveloppements")
		
		public List<EquipeDeveloppement>getEquipeDeveloppements()
		{
			return equipeDevService.getEquipeDeveloppements();
		}
	 
	 //modifier equipeDeveloppement
	 
	 @PutMapping(path="/equipeDeveloppement/{codeEquipe}")
	 public EquipeDeveloppement update(@PathVariable(name="codeEquipe") String codeEquipe,@RequestBody EquipeDeveloppement g) 
	 {
		 g.setCodeEquipe(codeEquipe);
		 return equipeDevService.updating(g);
}
	 //supprimer equipeDeveloppement
	 
	 @DeleteMapping(path="/equipeDeveloppement/{codeEquipe}")
	 public void delete(@PathVariable(name="codeEquipe") String codeEquipe)
	 {
		 equipeDevService.deleting(codeEquipe);
	 }
	 
}
