package com.lasantha.service;

import java.util.List;

import com.lasantha.entities.Person;

public interface PersonService {
	
	public void addPerson(Person p);
	public List<Person> listPersons();
	public void updatePerson(Person p);
	public void deletePerson(int id);
	public Person getPersonById(int id);
}
