package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.SurAffectation;
import com.example.demo.repository.SurAffectationRepository;

@Service
public class SurAffectationService {

	@Autowired
	SurAffectationRepository surAffRep;
	
	public SurAffectation saveSurAffectation(SurAffectation c) {
		return surAffRep.save(c);
		
	}
	public void supprimer(String idAss,String codeProjet)
	{
		
		surAffRep.deleteUsingSingleQuery(idAss,codeProjet);
	}
	
	
	
	public List<SurAffectation> getSurAffectations()
	{
		return surAffRep.findAll();
	}
	
	
}
