package com.example.dao;

import java.util.List;

//import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.PersonModel;

//import jakarta.persistence.EntityManagerFactory;

@Repository
public class PersonDao {

	// Hibernate
	@Autowired
	private SessionFactory sessionFactory;

	// JPA
	// @Autowired
	// private EntityManagerFactory entityManagerFactory;

	public List<PersonModel> findAllPerson() {
		return sessionFactory.getCurrentSession().createQuery("from PersonModel", PersonModel.class).list();
		// return entityManagerFactory.createEntityManager().createQuery("from PersonModel", PersonModel.class).getResultList();
	};
	
	public PersonModel getPerson(String id) {
		return sessionFactory.getCurrentSession().get(PersonModel.class, id);
	};
	
	public void savePerson(PersonModel person) {
		sessionFactory.getCurrentSession().merge(person);
	};
	
	public void removePerson(String id) {
		PersonModel person = getPerson(id);
		if (person != null) {
			sessionFactory.getCurrentSession().remove(person);
		};
	};
};
