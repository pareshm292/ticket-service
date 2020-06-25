package com.epam.paresh.codechallenge;

public class Person {
	
	private Integer age;
	
	private Integer salary;
	
	private Gender gender;
	
	private String location;

	public Person(Integer age, Integer salary, Gender gender, String location) {
		super();
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.location = location;
	}

	public Person() {
		super();
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
