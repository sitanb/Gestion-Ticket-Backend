package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, String> {
Produit findByCodePro(String codePro);
List<Produit>findAll();
 void deleteById(String codePro);
		

}
