package com.lasantha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lasantha.dao.PersonDAO;
import com.lasantha.entities.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	private PersonDAO persondao;
	
	@Transactional
	public void setPersonDAO(PersonDAO persondao){
		this.persondao = persondao;
	}
	
	@Transactional
	public void addPerson(Person p) {
			persondao.createUser(p);
	}
    
	@Transactional
	public List<Person> listPersons() {
		return persondao.listPersons();
	}
    @Transactional
	public void updatePerson(Person p) {
		persondao.editPerson(p);
	}
    @Transactional
	public void deletePerson(int id) {
		persondao.deletePerson(id);
		
	}
    @Transactional
	public Person getPersonById(int id) {
	return persondao.getPersonById(id);
	}
	
}
