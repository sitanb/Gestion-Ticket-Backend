package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LangageDeveloppement;
import com.example.demo.service.LangageDeveloppementService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LangageDeveloppementController {
@Autowired
	
	private LangageDeveloppementService lanDevService;
//ajouter langageDev

	 @PostMapping(path="/langageDev")
	 public LangageDeveloppement creerLangageDeveloppement(@Valid @RequestBody LangageDeveloppement newLangage)
	 {
	    return lanDevService.saveLangageDeveloppement(newLangage);
	  }
	 
	 //afficher langageDev
	 
	 @GetMapping(path="/langageDevs")
		
		public List<LangageDeveloppement>getLangageDeveloppements()
		{
			return lanDevService.getLangageDeveloppements();
		}
	 
	 //modifier langageDev
	 
	 @PutMapping(path="/langageDev/{codeLang}")
	 public LangageDeveloppement update(@PathVariable(name="codeLang") String codeLang,@RequestBody LangageDeveloppement g) 
	 {
		 g.setCodeLang(codeLang);
		 return lanDevService.updating(g);
}
	 //supprimer langageDev
	 
	 @DeleteMapping(path="/langageDev/{codeLang}")
	 public void delete(@PathVariable(name="codeLang") String codeLang)
	 {
		 lanDevService.deleting(codeLang);
	 }
	 

}
