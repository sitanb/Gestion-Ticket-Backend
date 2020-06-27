package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Utilisateur;
import com.example.demo.repository.UtilisateurRepository;

@Service
public class UtilisateurService {
	@Autowired
	UtilisateurRepository utilisateurRep;

	public Utilisateur saveUtilisateur(Utilisateur c) {
		Utilisateur u=utilisateurRep.findBynomUtil(c.getNomUtil());
		boolean b=utilisateurRep.findAll().toString().contains(c.getEmail());
		if(u==null && b==false) 
		{
			
			return utilisateurRep.save(c);
			
		}
		else
			return null;
	}
	
	
	public List<Utilisateur> getUtilisateurs()
	{
		return utilisateurRep.findAll();
	}
	
	public Utilisateur updating(Utilisateur g) 
	{	if(utilisateurRep.findById(g.getNomUtil())!=null) {
				String email=g.getEmail();
				Utilisateur u=utilisateurRep.findBynomUtil(g.getNomUtil());
				if(!email.equals(u.getEmail()))
				{
					if(!utilisateurRep.findAll().toString().contains(g.getEmail()))
					{
						return utilisateurRep.save(g);
					}
				}
				else {
					return utilisateurRep.save(g);
				}
		}
		return null;
}
	public void deleting(String nomUtil)
	{
		utilisateurRep.deleteById(nomUtil);
	}
}

