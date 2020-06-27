package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Commentaire;
@RepositoryRestResource
public interface CommentaireRepository extends JpaRepository<Commentaire, String> {
	Optional<Commentaire> findById(String idComm);
	List<Commentaire>findAll();
	void deleteById(String idComm);

}
