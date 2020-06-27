package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserCompte;

import com.example.demo.repository.UserCompteRepository;

@Service
public class UserCompteService {
	@Autowired
	UserCompteRepository userCompteRep;
	public UserCompte saveUserCompte(UserCompte c) {
		
			return userCompteRep.save(c);
	}
	
	public List<UserCompte> getUserComptes()
	{
		return userCompteRep.findAll();
	}
	
	public UserCompte updating(UserCompte g) 
	{
		if(userCompteRep.findById(g.getNomUtil())!=null)
		{
			
		return userCompteRep.save(g);
		}
		return null;
		
}
	
	public void deleting(String nomUtil)
	{
		userCompteRep.deleteById(nomUtil);
	}
}
