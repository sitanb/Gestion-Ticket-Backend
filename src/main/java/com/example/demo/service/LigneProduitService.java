package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.LigneProduit;

import com.example.demo.repository.LigneProduitRepository;

@Service
public class LigneProduitService {
	@Autowired
	LigneProduitRepository ligneProduitRep;
	
	public LigneProduit saveLigneProduit(LigneProduit c) {
		return ligneProduitRep.save(c);
		
	}
	public void supprimer(String codePro,String raisonSoc,String date)
	{
		
		ligneProduitRep.deleteUsingSingleQuery(codePro,raisonSoc,date);
	}
	
	public void editing(String codePro,String raisonSoc,String date,int quantite, double prixUnitaire)
	{
		
		ligneProduitRep.updateUsingSingleQuery(codePro, raisonSoc, date, quantite,prixUnitaire);
	}
	
	public List<LigneProduit> getLigneProduits()
	{
		return ligneProduitRep.findAll();
	}
	
	public LigneProduit updating(LigneProduit g) 
	{
		if(ligneProduitRep.findById(g.getCodePro())!=null)
		{
			
		return ligneProduitRep.save(g);
				
		}
		return null;
}
	
	public void deleting(String codePro)
	{
		ligneProduitRep.deleteById(codePro);
	}
	
}
