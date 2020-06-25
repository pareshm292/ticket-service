package com.epam.ticket;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptonHandler {

	@ExceptionHandler
	public ResponseEntity<CustomError> exception(TicketNotFoundException exception){
		
		return new ResponseEntity<CustomError>(new CustomError(10, "Ticket ID not found"), HttpStatus.NOT_FOUND);
		
	}
	
}
