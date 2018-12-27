package com.lasantha.dao;

import java.util.List;
import com.lasantha.entities.Person;


public interface PersonDAO {
	public void createUser(Person p);
	public List<Person> listPersons();
	public void editPerson(Person p);
	public void deletePerson(int id);
	public Person getPersonById(int id);
}
