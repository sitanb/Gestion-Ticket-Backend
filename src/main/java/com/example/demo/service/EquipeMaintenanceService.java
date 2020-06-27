package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.EquipeMaintenance;

import com.example.demo.repository.EquipeMaintenanceRepository;

@Service
public class EquipeMaintenanceService {
	@Autowired
	EquipeMaintenanceRepository equipeMainRep;
	public EquipeMaintenance saveEquipeMaintenance(EquipeMaintenance c) {
		EquipeMaintenance g=equipeMainRep.findByCode(c.getCode());
		if(g!=null)
			return null;
		else
			return equipeMainRep.save(c);
			
	}
	
	
	public List<EquipeMaintenance> getEquipeMaintenances()
	{
		return equipeMainRep.findAll();
	}
	
	public EquipeMaintenance updating(EquipeMaintenance g) 
	{
		if(equipeMainRep.findByCode(g.getCode())!=null)
		{
			
		return equipeMainRep.save(g);
		}
		return null;
}
	
	public void deleting(String code)
	{
		equipeMainRep.deleteById(code);
	}
}
