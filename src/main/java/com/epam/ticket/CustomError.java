package com.epam.ticket;

public class CustomError {

	private Integer internalCode;
	
	public CustomError() {
		super();
	}

	public CustomError(Integer internalCode, String description) {
		super();
		this.internalCode = internalCode;
		this.description = description;
	}

	private String description;

	public Integer getInternalCode() {
		return internalCode;
	}

	public void setInternalCode(Integer internalCode) {
		this.internalCode = internalCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
