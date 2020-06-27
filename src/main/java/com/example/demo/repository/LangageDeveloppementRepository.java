package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LangageDeveloppement;

public interface LangageDeveloppementRepository extends JpaRepository<LangageDeveloppement, String> {
	LangageDeveloppement findByCodeLang(String codeLang);

	List<LangageDeveloppement>findAll();
	void deleteById(String code);
	
		
}
