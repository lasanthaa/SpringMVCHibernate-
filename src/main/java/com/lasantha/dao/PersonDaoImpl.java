package com.lasantha.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lasantha.entities.Person;

@Repository
public class PersonDaoImpl implements PersonDAO {
	
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void createUser(Person p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		
	}

	public List<Person> listPersons() {
		
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Person> list = session.createQuery("from Person", Person.class).list();
		
		return list;
	}

	public void editPerson(Person p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		
	}

	public void deletePerson(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Person person =session.get(Person.class, id);
		
		if(null != person){
			session.delete(person);
		}
		
		
	}

	public Person getPersonById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Person person = session.get(Person.class, id);
		return person;
		
	}
	
}
