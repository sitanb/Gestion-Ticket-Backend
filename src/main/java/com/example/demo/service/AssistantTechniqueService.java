package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AssistantTechnique;
import com.example.demo.repository.AssistantTechniqueRepository;

@Service
public class AssistantTechniqueService {
	@Autowired
	AssistantTechniqueRepository assTechRep;
	
	public AssistantTechnique saveAssistantTechnique(AssistantTechnique c) {
		return assTechRep.save(c);
		
	}
	
	public List<AssistantTechnique> getAssistantTechniques()
	{
		return assTechRep.findAll();
	}
	
	public AssistantTechnique updating(AssistantTechnique g) 
	{
		if(assTechRep.findById(g.getIdAss())!=null)
		{
			
		return assTechRep.save(g);
				
		}
		return null;
}
	
	public void deleting(String idAss)
	{
		assTechRep.deleteById(idAss);
	}
	
}
