package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.CompteRendu;
import com.example.demo.repository.CompteRenduRepository;

@Service
public class CompteRenduService {

	@Autowired
	CompteRenduRepository compteRenduRep;
	
	public CompteRendu saveCompteRendu(CompteRendu c) {
		
		return compteRenduRep.save(c);
		
	}
	
	public List<CompteRendu> getCompteRendus()
	{
		return compteRenduRep.findAll();
	}
	
	public CompteRendu updating(CompteRendu g) 
	{
		if(compteRenduRep.findByIdCompteRendu(g.getIdCompteRendu())!=null)
		{
			
		return compteRenduRep.save(g);
				
		}
		return null;
}
	
	public void deleting(String idCompteRendu)
	{
		compteRenduRep.deleteById(idCompteRendu);
	}
}
