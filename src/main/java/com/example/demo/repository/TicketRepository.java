package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Ticket;
@RepositoryRestResource
public interface TicketRepository extends JpaRepository<Ticket, String> {

 Optional<Ticket> findById(String idTicket) ;
 List<Ticket>findAll();
	void deleteById(String idTicket);
	
}
