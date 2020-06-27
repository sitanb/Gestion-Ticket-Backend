package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Ticket;
import com.example.demo.repository.TicketRepository;

@Service
public class TicketService {
	@Autowired
	TicketRepository ticketRep;
	
	public Ticket saveTicket(Ticket c) {
		return ticketRep.save(c);
		
	}
	
	public List<Ticket> getTickets()
	{
		return ticketRep.findAll();
	}
	
	public Ticket updating(Ticket g) 
	{
		if(ticketRep.findById(g.getIdTicket())!=null)
		{
			
		return ticketRep.save(g);
				
		}
		return null;
}
	
	public void deleting(String idTicket)
	{
		ticketRep.deleteById(idTicket);
	}
}
