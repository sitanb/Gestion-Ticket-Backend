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

import com.example.demo.model.Produit;
import com.example.demo.service.ProduitService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")

public class ProduitController {
@Autowired
private ProduitService produitService;
//ajouter produit

	 @PostMapping(path="/produit")
	 public Produit creerProduit(@Valid @RequestBody Produit newProduit)
	 {
	    return produitService.saveProduit(newProduit);
	  }
	 
 //afficher produit
	 
	 @GetMapping(path="/produits")
		
		public List<Produit>getProduits()
		{
			return produitService.getProduits();
		}
	//modifier produit
	 
		 @PutMapping(path="/produit/{codePro}")
		 public Produit update(@PathVariable(name="codePro") String codePro,@RequestBody Produit g) 
		 {
			g.setCodePro(codePro);
			 return produitService.updating(g);
	}
		//supprimer produit
		 
		 @DeleteMapping(path="/produit/{codePro}")
		 public void delete(@PathVariable(name="codePro") String codePro)
		 {
			produitService.deleting(codePro);
		 }
	 
}
