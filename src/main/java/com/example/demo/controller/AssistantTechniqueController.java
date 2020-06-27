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

import com.example.demo.model.AssistantTechnique;
import com.example.demo.service.AssistantTechniqueService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AssistantTechniqueController {
@Autowired
	
	private AssistantTechniqueService assService;

//ajouter assistantTechnique

	 @PostMapping(path="/assistantTechnique")
	 public AssistantTechnique creerAssistantTechnique(@Valid @RequestBody AssistantTechnique newAssistantTechnique)
	 {
	    return assService.saveAssistantTechnique(newAssistantTechnique);
	  }
	 
	 //afficher assistantTechnique
	 
	 @GetMapping(path="/assistantTechniques")
		
		public List<AssistantTechnique>getAssistantTechniques()
		{
			return assService.getAssistantTechniques();
		}
	 
	 //modifier assistantTechnique
	 
	 @PutMapping(path="/assistantTechnique/{idAss}")
	 public AssistantTechnique update(@PathVariable(name="idAss") String idAss,@RequestBody AssistantTechnique g) 
	 {
		g.setIdAss(idAss);
		 return assService.updating(g);
}
	 //supprimer assistantTechnique
	 
	 @DeleteMapping(path="/assistantTechnique/{idAss}")
	 public void delete(@PathVariable(name="idAss") String idAss)
	 {
		 assService.deleting(idAss);
	 }
}
