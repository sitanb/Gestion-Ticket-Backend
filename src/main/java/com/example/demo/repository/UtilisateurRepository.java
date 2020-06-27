package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Utilisateur;
@RepositoryRestResource
public interface UtilisateurRepository extends JpaRepository<Utilisateur, String> {
	Utilisateur findBynomUtil(String nomUtil);
	List<Utilisateur>findAll();
	void deleteBynomUtil(String nomUtil);
	
}
