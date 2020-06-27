package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Societe;
import com.example.demo.repository.SocieteRepository;

@Service
public class SocieteService {
@Autowired

SocieteRepository societeRep;

public Societe saveSociete(Societe c) {
	Societe g=societeRep.findByRaisonSoc(c.getRaisonSoc());
	if(g!=null)
		return null;
	else
		return societeRep.save(c);
}

public List<Societe> getSocietes()
{
	return societeRep.findAll();
}

public Societe updating(Societe g) 
{
	if(societeRep.findByRaisonSoc(g.getRaisonSoc())!=null)
	{
		
	return societeRep.save(g);
	}
	return null;
}
public void deleting(String raisonSoc)
{
	societeRep.deleteById(raisonSoc);
}

}
