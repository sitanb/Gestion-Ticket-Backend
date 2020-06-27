package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.EquipeDeveloppement;
@RepositoryRestResource
public interface EquipeDeveloppementRepository extends JpaRepository<EquipeDeveloppement, String> {
	 EquipeDeveloppement findByCodeEquipe(String codeEquipe);
	List<EquipeDeveloppement>findAll();
	void deleteById(String codeEquipe);
}
