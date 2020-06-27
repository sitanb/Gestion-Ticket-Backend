package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Projet;
@RepositoryRestResource
public interface ProjetRepository extends JpaRepository<Projet, String> {
	 Projet findByCodeProjet(String codeProjet) ;
	List<Projet>findAll();
	void deleteById(String codeProjet);
}
