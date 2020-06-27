package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.LangageDeveloppement;

import com.example.demo.repository.LangageDeveloppementRepository;

@Service
public class LangageDeveloppementService {
	@Autowired
	LangageDeveloppementRepository langDevRep;
	public LangageDeveloppement saveLangageDeveloppement(LangageDeveloppement c) {
		LangageDeveloppement g=langDevRep.findByCodeLang(c.getCodeLang());
		if(g!=null)
			return null;
		else
			return langDevRep.save(c);
	}
	
	
	public List<LangageDeveloppement> getLangageDeveloppements()
	{
		return langDevRep.findAll();
	}
	
	public LangageDeveloppement updating(LangageDeveloppement g) 
	{
		if(langDevRep.findByCodeLang(g.getCodeLang())!=null)
		{
			
		return langDevRep.save(g);
		}
		return null;
}
	
	public void deleting(String code)
	{
		langDevRep.deleteById(code);
	}
}
