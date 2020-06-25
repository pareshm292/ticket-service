package com.epam.ticket;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ticketId;
	
	private String description;
	
	public Ticket(Integer ticketId, String description, List<Task> tasks) {
		super();
		this.ticketId = ticketId;
		this.description = description;
		this.tasks = tasks;
	}

	
	@OneToMany(
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	@JoinColumn(name = "ticketId")
	private List<Task> tasks = new ArrayList<Task>();

	public Ticket(Integer ticketId, List<Task> tasks) {
		super();
		this.ticketId = ticketId;
		this.tasks = tasks;
	}

	public Ticket() {
		super();
	}

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
