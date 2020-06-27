package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AffectationMaintenance;
import com.example.demo.repository.AffectationMaintenanceRepository;

@Service
public class AffectationMaintenanceService {
	@Autowired
	AffectationMaintenanceRepository affMainRep;
	
	public AffectationMaintenance saveAffectationMaintenance(AffectationMaintenance c) {
	
		return affMainRep.save(c);
		
	}
	
	public List<AffectationMaintenance> getAffectationMaintenances()
	{
		return affMainRep.findAll();
	}
	
	public AffectationMaintenance updating(AffectationMaintenance g) 
	{
		if(affMainRep.findById(g.getIdAss())!=null)
		{
			
		return affMainRep.save(g);
				
		}
		return null;
}
	
	public void deleting(Long idAss)
	{
		affMainRep.deleteById(idAss);
	}
	
	public void supprimer(String code,int idAss)
	{
		
		affMainRep.deleteUsingSingleQuery(code, idAss);;
	}
	
}
