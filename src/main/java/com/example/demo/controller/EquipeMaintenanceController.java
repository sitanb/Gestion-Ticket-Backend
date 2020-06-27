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

import com.example.demo.model.EquipeMaintenance;

import com.example.demo.service.EquipeMaintenanceService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EquipeMaintenanceController {
@Autowired
	
	private EquipeMaintenanceService equipeMainService;
	
	//ajouter equipeMaintenance
	
	 @PostMapping(path="/equipeMaintenance")
	 public EquipeMaintenance creerEquipeMaintenance(@Valid @RequestBody EquipeMaintenance newEquipeMaintenance)
	 {
	    return equipeMainService.saveEquipeMaintenance(newEquipeMaintenance);
	 }
	 
	 //afficher equipeMaintenance
	 
	 @GetMapping(path="/equipeMaintenances")
		
		public List<EquipeMaintenance>getEquipeMaintenances()
		{
			return equipeMainService.getEquipeMaintenances();
		}
	 
	 //modifier equipeMaintenance
	 
	 @PutMapping(path="/equipeMaintenance/{code}")
	 public EquipeMaintenance update(@PathVariable(name="code") String code,@RequestBody EquipeMaintenance g) 
	 {
		g.setCode(code);
		 return equipeMainService.updating(g);
}
	 //supprimer equipeMaintenance
	 
	 @DeleteMapping(path="/equipeMaintenance/{code}")
	 public void delete(@PathVariable(name="code") String code)
	 {
		 equipeMainService.deleting(code);
	 }
}
