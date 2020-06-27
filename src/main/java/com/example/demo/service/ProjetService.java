package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Projet;
import com.example.demo.repository.ProjetRepository;

@Service
public class ProjetService {
	@Autowired
	ProjetRepository projetRep;
	
	public Projet saveProjet(Projet c) {
		Projet g=projetRep.findByCodeProjet(c.getCodeProjet());
		if(g!=null)
			return null;
		else
			return projetRep.save(c);
	}
	
	public List<Projet> getProjets()
	{
		return projetRep.findAll();
	}
	
	public Projet updating(Projet g) 
	{
		if(projetRep.findById(g.getCodeProjet())!=null)
		{
			
		return projetRep.save(g);
		}
		return null;
}
	
	public void deleting(String codeProjet)
	{
		projetRep.deleteById(codeProjet);
	}

}
