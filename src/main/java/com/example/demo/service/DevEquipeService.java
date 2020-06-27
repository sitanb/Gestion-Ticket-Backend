package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.DevEquipe;
import com.example.demo.repository.DevEquipeRepository;

@Service
public class DevEquipeService {
	@Autowired
	DevEquipeRepository devEquipeRep;
	
	public DevEquipe saveDevEquipe(DevEquipe c) {
		System.out.println(c.toString());
		return devEquipeRep.save(c);
		
	}
	
	public List<DevEquipe> getDevEquipes()
	{
		return devEquipeRep.findAll();
	}
	
	public void supprimer(String codeEquipe,String idDev)
	{
		
		devEquipeRep.deleteUsingSingleQuery(codeEquipe, idDev);;
	}
	
	public void miseajour(String codeEquipe,String idDev,String etatSupp)
	{
		
		devEquipeRep.updateUsingSingleQuery(codeEquipe, idDev, etatSupp);
	}
	
	public void deleting(DevEquipe dev )
	{

				devEquipeRep.delete(dev);
			}
		
	
	
}
