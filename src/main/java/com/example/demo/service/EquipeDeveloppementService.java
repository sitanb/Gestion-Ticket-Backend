package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.EquipeDeveloppement;
import com.example.demo.repository.EquipeDeveloppementRepository;

@Service
public class EquipeDeveloppementService {
	@Autowired
	EquipeDeveloppementRepository equipeDeveRep;
	public EquipeDeveloppement saveEquipeDeveloppement(EquipeDeveloppement c) {
		EquipeDeveloppement g=equipeDeveRep.findByCodeEquipe(c.getCodeEquipe());
		if(g!=null)
			return null;
		else
			return equipeDeveRep.save(c);
	}
	
	
	public List<EquipeDeveloppement> getEquipeDeveloppements()
	{
		return equipeDeveRep.findAll();
	}
	
	public EquipeDeveloppement updating(EquipeDeveloppement g) 
	{
		if(equipeDeveRep.findByCodeEquipe(g.getCodeEquipe())!=null)
		{
			
		return equipeDeveRep.save(g);
		}
		return null;
}
	
	public void deleting(String codeEquipe)
	{
		equipeDeveRep.deleteById(codeEquipe);
	}
}
