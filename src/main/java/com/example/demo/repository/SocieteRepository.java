package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Societe;

public interface SocieteRepository extends JpaRepository<Societe, String> {
Societe findByRaisonSoc(String raisonSoc);
List<Societe>findAll();

 void deleteById(String raisonSoc) ;
		
}
