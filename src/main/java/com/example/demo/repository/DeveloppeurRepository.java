package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Developpeur;
@RepositoryRestResource
public interface DeveloppeurRepository extends JpaRepository<Developpeur, String> {
	Optional<Developpeur> findById(String idDev);
	List<Developpeur>findAll();
	void deleteById(String idDev);
}
