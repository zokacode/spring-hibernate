package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.PersonModel;
import com.example.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService personService;

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@GetMapping(value = "/person", produces = "application/json")
	public List<PersonModel> person() {
		return personService.findAllPerson();
	}
}
