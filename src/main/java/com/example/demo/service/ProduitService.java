package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Produit;
import com.example.demo.repository.ProduitRepository;

@Service
public class ProduitService {
@Autowired
ProduitRepository produitRep;
public Produit saveProduit(Produit c) {
	Produit g=produitRep.findByCodePro(c.getCodePro());
	if(g!=null)
		return null;
	else
		return produitRep.save(c);
}
public List<Produit> getProduits()
{
	return produitRep.findAll();
}


public Produit updating(Produit g) 
{
	if(produitRep.findByCodePro(g.getCodePro())!=null)
	{
		
	return produitRep.save(g);
	}
	return null;
}
public void deleting(String codePro)
{
	produitRep.deleteById(codePro);
}

}
