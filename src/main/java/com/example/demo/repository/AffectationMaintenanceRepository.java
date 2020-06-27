package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.AffectationMaintenance;

public interface AffectationMaintenanceRepository extends JpaRepository<AffectationMaintenance, Long> {
	Optional<AffectationMaintenance> findById(Long idAss);
	List<AffectationMaintenance>findAll();
	void deleteById(Long idAss);
	 @Transactional
	    @Modifying
	    @Query(value = "delete from affectation_maintenance where code = ?1 and id_ass = ?2 ",nativeQuery = true)
	    void deleteUsingSingleQuery(String code,int idAss);
}
