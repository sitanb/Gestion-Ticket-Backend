package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.demo.model.CompteRendu;
@RepositoryRestResource
public interface CompteRenduRepository extends JpaRepository<CompteRendu, String> {
CompteRendu findByIdCompteRendu(String idCompteRendu);
List<CompteRendu>findAll();
void deleteById(String idCompteRendu);


}
