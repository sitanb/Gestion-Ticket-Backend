package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.AssistantTechnique;

@RepositoryRestResource
public interface AssistantTechniqueRepository extends JpaRepository<AssistantTechnique, String> {
	Optional<AssistantTechnique> findById(String idAss);
	List<AssistantTechnique>findAll();
	void deleteById(String code);
}
