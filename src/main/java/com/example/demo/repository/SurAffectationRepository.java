package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.SurAffectation;
@RepositoryRestResource
public interface SurAffectationRepository extends JpaRepository<SurAffectation, Long> {
	 @Transactional
	    @Modifying
	    @Query(value = "delete from sur_affectation where id_ass = ?1 and code_projet = ?2",nativeQuery = true)
	    void deleteUsingSingleQuery(String idAss,String codeProjet);
		List<SurAffectation>findAll();

}
