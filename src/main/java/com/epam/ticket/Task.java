package com.epam.ticket;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer taskId;
	
	private String taskName;

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public Task() {
		super();
	}

	public Task(Integer taskId, String taskName) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
}
