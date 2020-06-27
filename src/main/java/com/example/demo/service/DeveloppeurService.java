package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Developpeur;
import com.example.demo.repository.DeveloppeurRepository;

@Service
public class DeveloppeurService {
	@Autowired
	DeveloppeurRepository developpeurRep;
	
	public Developpeur saveDeveloppeur(Developpeur c) {
	
			return developpeurRep.save(c);
	}
	
	public List<Developpeur> getDeveloppeurs()
	{
		return developpeurRep.findAll();
	}
	
	public Developpeur updating(Developpeur g) 
	{
		if(developpeurRep.findById(g.getIdDev())!=null)
		{
			
		return developpeurRep.save(g);
		}
		return null;
}
	
	public void deleting(String idDev)
	{
		developpeurRep.deleteById(idDev);
	}
}
