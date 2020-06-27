package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Inscription;
@RepositoryRestResource
public interface InscriptionRepository extends JpaRepository<Inscription, String> {
Inscription findByNomUtil(String nomUtil);
 List<Inscription> findAll();
 void deleteById(String nomUtil);
		
	

}
