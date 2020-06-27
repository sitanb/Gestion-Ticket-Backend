package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ticket;
import com.example.demo.service.TicketService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TicketController {
@Autowired
	
	private TicketService ticketService;

//ajouter ticket

	 @PostMapping(path="/ticket")
	 public Ticket creerTicket(@Valid @RequestBody Ticket newTicket)
	 {
	    return ticketService.saveTicket(newTicket);
	  }
	 
	 //afficher ticket
	 
	 @GetMapping(path="/tickets")
		
		public List<Ticket>getTickets()
		{
			return ticketService.getTickets();
		}
	 
	 //modifier ticket
	 
	 @PutMapping(path="/ticket/{idTicket}")
	 public Ticket update(@PathVariable(name="idTicket") String idTicket,@RequestBody Ticket g) 
	 {
		g.setIdTicket(idTicket);
		 return ticketService.updating(g);
}
	 //supprimer ticket
	 
	 @DeleteMapping(path="/ticket/{idTicket}")
	 public void delete(@PathVariable(name="idTicket") String idTicket)
	 {
		 ticketService.deleting(idTicket);
	 }
}
