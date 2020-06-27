package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Message;

@RepositoryRestResource
public interface MessageRepository extends JpaRepository<Message, Long> {
	Optional<Message> findById(Long idMsg);
	List<Message>findAll();
	void deleteById(Long idMsg);
	
}
