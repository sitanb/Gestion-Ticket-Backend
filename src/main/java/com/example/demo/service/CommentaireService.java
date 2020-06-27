package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Commentaire;

import com.example.demo.repository.CommentaireRepository;

@Service
public class CommentaireService {
	@Autowired
	CommentaireRepository comRep;
	
	public Commentaire saveCommentaire(Commentaire c) {
		return comRep.save(c);
		
	}
	
	public List<Commentaire> getCommentaires()
	{
		return comRep.findAll();
	}
	
	public Commentaire updating(Commentaire g) 
	{
		if(comRep.findById(g.getIdComm())!=null)
		{
			
		return comRep.save(g);
				
		}
		return null;
}
	
	public void deleting(String idComm)
	{
		comRep.deleteById(idComm);
	}
}
