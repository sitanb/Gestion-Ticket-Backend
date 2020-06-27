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

import com.example.demo.model.AffectationMaintenance;
import com.example.demo.service.AffectationMaintenanceService;
@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AffectationMaintenanceController {
@Autowired
	
	private AffectationMaintenanceService affMainService;
//ajouter AffMaintenance

	 @PostMapping(path="/AffMaintenance")
	 public AffectationMaintenance creerAffectationMaintenance(@Valid @RequestBody AffectationMaintenance newAff)
	 {
	    return affMainService.saveAffectationMaintenance(newAff);
	  }
	 
	 //afficher AffMaintenance
	 
	 @GetMapping(path="/AffMaintenances")
		
		public List<AffectationMaintenance>getAffectationMaintenances()
		{
			return affMainService.getAffectationMaintenances();
		}
	 
	 //modifier AffMaintenance
	 
	 @PutMapping(path="/AffMaintenance/{idAss}")
	 public AffectationMaintenance update(@PathVariable(name="idAss") Long idAss,@RequestBody AffectationMaintenance g) 
	 {
	g.setIdAss(idAss);
		 return affMainService.updating(g);
}
	 //supprimer devEquipe
	 
	 @DeleteMapping(path="/AffMaintenance/{idAss}")
	 public void delete(@PathVariable(name="idAss") Long idAss)
	 {
		 affMainService.deleting(idAss);
	 }
	 
	 @DeleteMapping(path="/AffMaintenances/{code}/{idAss}")
	 public void supp(@PathVariable(name="code") String code, @PathVariable(name = "idAss") int idAss)
	 { 
		affMainService.supprimer(code, idAss);
	 }
}
