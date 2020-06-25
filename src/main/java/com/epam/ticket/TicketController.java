package com.epam.ticket;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

	@Autowired
	private TicketRepository ticketRepository;
	
	@RequestMapping(value = "/tickets/{ticketId}" , method = RequestMethod.GET)
	public ResponseEntity<?> getTicket(@PathVariable Integer ticketId) throws TicketNotFoundException {
		
		Optional<Ticket> ticket = ticketRepository.findById(ticketId);
		
		if(ticket.isPresent()) {
			return new ResponseEntity<>(ticket.get(), HttpStatus.OK);
		}
		else {
			throw new TicketNotFoundException();
		}
		
	}
	
	@RequestMapping(value = "/tickets/" , method = RequestMethod.POST)
	public ResponseEntity<?> createTicket(@RequestBody Ticket ticket){
		
		Ticket createdTicket =  ticketRepository.save(ticket);
		
		return new ResponseEntity<>(createdTicket, HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value = "/tickets/{ticketId}" , method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteTicket(@PathVariable Integer ticketId){
		
		ticketRepository.deleteById(ticketId);
		
		return ResponseEntity.noContent().build();
		
	}
	
	@RequestMapping(value = "/tickets/{ticketId}/tasks/" , method = RequestMethod.POST)
	public ResponseEntity<?> createTask(@RequestBody Task task , @PathVariable Integer ticketId){
		
		Ticket existingTicket =  ticketRepository.getOne(ticketId);
		
		existingTicket.getTasks().add(task);
		
		ticketRepository.save(existingTicket);
		
		return new ResponseEntity<>(existingTicket, HttpStatus.CREATED);
		
	}
	
	
	
	
}
