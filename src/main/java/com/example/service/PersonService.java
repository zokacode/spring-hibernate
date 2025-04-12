package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.PersonDao;
import com.example.model.PersonModel;

@Service
public class PersonService {
	
	@Autowired
	private PersonDao personDao;

	@Transactional
	public List<PersonModel> findAllPerson() {
        List<PersonModel> personList = personDao.findAllPerson();
		return personList;
	};
}
