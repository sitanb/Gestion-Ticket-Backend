package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.EquipeMaintenance;


public interface EquipeMaintenanceRepository extends JpaRepository<EquipeMaintenance, String> {

	EquipeMaintenance findByCode(String code);
	List<EquipeMaintenance>findAll();
	void deleteById(String codeMain);
	
}
