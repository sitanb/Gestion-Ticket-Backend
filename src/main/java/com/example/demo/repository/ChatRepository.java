package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.demo.model.Chat;
@RepositoryRestResource
public interface ChatRepository extends JpaRepository<Chat, String> {
	Chat findBynomUtil(String nomUtil);
	List<Chat>findAll();
	void deleteBynomUtil(String nomUtil);

}
