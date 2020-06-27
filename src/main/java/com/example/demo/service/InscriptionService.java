package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Inscription;
import com.example.demo.repository.InscriptionRepository;

@Service
public class InscriptionService {
	@Autowired
	InscriptionRepository inscriptionRep;
	public Inscription saveInscription(Inscription c) {
		Inscription g=inscriptionRep.findByNomUtil(c.getNomUtil());
		if(g!=null)
			return null;
		else
			return inscriptionRep.save(c);
	}
	
	public List<Inscription> getInscriptions()
	{
		return inscriptionRep.findAll();
	}
	
	public Inscription updating(Inscription g) 
	{
		if(inscriptionRep.findByNomUtil(g.getNomUtil())!=null)
		{
			
		return inscriptionRep.save(g);
		}
		return null;
}
	
	public void deleting(String nomUtil)
	{
		inscriptionRep.deleteById(nomUtil);
	}
	
	
}
