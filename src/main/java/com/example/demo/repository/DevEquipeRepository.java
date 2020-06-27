package com.example.demo.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.DevEquipe;
@RepositoryRestResource
public interface DevEquipeRepository extends JpaRepository<DevEquipe, String> {
	Optional<DevEquipe> findById(String codeEquipe);
	List<DevEquipe>findAll();
	
	 void delete(DevEquipe dev) ;
		
	 @Transactional
	    @Modifying
	    @Query(value = "update dev_equipe set etat_supp=?3 where code_equipe = ?1 and id_dev = ?2 ",nativeQuery = true)
	    void updateUsingSingleQuery(String codeEquipe,String idDev,String etatSupp);
	 
	 @Transactional
	    @Modifying
	    @Query(value = "delete from dev_equipe where code_equipe = ?1 and id_dev = ?2 ",nativeQuery = true)
	    void deleteUsingSingleQuery(String codeEquipe,String idDev);
		
		
	
	
}
