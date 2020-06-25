package com.epam.paresh.codechallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class PareshCodeChallengeOne {
	
	/*
	 *  Perosn class has four attributes name , Gender , Salary , location
	 *  
	 *  Create sufficient Item data to fulfill following requirements
	 * 
	 * 1. Average Salary of Persons who meet followin creiterion
	 * 
	 * - Age > 25
	 * - Salary > 25000
	 * - Gender = Female
	 * - Location = Nagpur
	 * 
	 * 2. Seggregate the Persons based on their location 
	 * 
	 * Note: Use only Java 8 features like Streams , Lamda ,Functional Interface , Optionsl , method refrence
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person(25, 30000, Gender.FEMALE, "Nagpur"));
		persons.add(new Person(20, 20000, Gender.MALE, "Hyd"));
		persons.add(new Person(27, 37000, Gender.FEMALE, "Nagpur"));
		persons.add(new Person(26, 26000, Gender.FEMALE, "Nagpur"));
		persons.add(new Person(25, 32000, Gender.MALE, "Mumbai"));
		
		OptionalDouble averageSalary = persons.stream()
				.filter(person -> person.getAge() > 25)
				.filter(person -> person.getSalary() > 25000 )
				.filter(person -> person.getGender() == Gender.FEMALE)
				.filter(person -> person.getLocation().equalsIgnoreCase("Nagpur"))
				//.map(person -> person.getSalary())
				//.collect(Collectors.averagingInt(salary -> salary));
				.mapToDouble(Person::getSalary)
				.average();
		
		
		System.out.println(averageSalary.getAsDouble());
		
		Map<String,List<Person>> map = persons.stream().collect(Collectors.groupingBy(Person::getLocation));
		
		
		/*
		 * CREATE 3 APIS ,
		 * CREATE TICKET -> TASKS
		 * GET using task ID
		 * DELETE -> 
		 * 
		 */
		
		
		
		
		
		
	}

}
