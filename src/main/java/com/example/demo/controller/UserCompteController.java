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
import com.example.demo.model.UserCompte;

import com.example.demo.service.UserCompteService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserCompteController {
@Autowired
	
	private UserCompteService userCompteService;

//ajouter userCompte

	 @PostMapping(path="/userCompte")
	 public UserCompte creerUserCompte(@Valid @RequestBody UserCompte newUserCompte)
	 {
	    return userCompteService.saveUserCompte(newUserCompte);
	  }
	 
	 //afficher userCompte
	 
	 @GetMapping(path="/userComptes")
		
		public List<UserCompte>getUserComptes()
		{
			return userCompteService.getUserComptes();
		}
	 
	 //modifier userCompte
	 
	 @PutMapping(path="/userCompte/{nomUtil}")
	 public UserCompte update(@PathVariable(name="nomUtil") String nomUtil,@RequestBody UserCompte g) 
	 {
		g.setNomUtil(nomUtil);
		 return userCompteService.updating(g);
}
	 //supprimer userCompte
	 
	 @DeleteMapping(path="/userCompte/{nomUtil}")
	 public void delete(@PathVariable(name="nomUtil") String nomUtil)
	 {
		userCompteService.deleting(nomUtil);
	 }
	
}
