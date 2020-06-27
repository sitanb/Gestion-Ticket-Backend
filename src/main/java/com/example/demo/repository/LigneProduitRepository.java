package com.example.demo.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.LigneProduit;
@RepositoryRestResource
public interface LigneProduitRepository extends JpaRepository<LigneProduit, String> {
	
    @Transactional
    @Modifying
    @Query(value = "delete from ligne_produit where code_pro = ?1 and raison_soc = ?2 and date = ?3",nativeQuery = true)
    void deleteUsingSingleQuery(String codePro,String raisonSoc,String date);
    @Transactional
    @Modifying
    @Query(value = "update ligne_produit set quantite =?4 where code_pro = ?1 and raison_soc = ?2 and date = ?3",nativeQuery = true)
    void updateUsingSingleQuery(String codePro,String raisonSoc,String date, int quantite, double prixUnitaire);
	Optional<LigneProduit> findById(String codePro);
	List<LigneProduit>findAll();
	void deleteById(String codePro);
}
