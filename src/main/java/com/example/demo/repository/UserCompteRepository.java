package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.demo.model.UserCompte;

@RepositoryRestResource
public interface UserCompteRepository extends JpaRepository<UserCompte, String> {
Optional<UserCompte> findById(String nomUtil);
List<UserCompte>findAll();
void deleteById(String nomUtil);
}
