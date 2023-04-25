package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;
	
	public List<Person> findPersons()
	{
		return personRepository.findAll();
	}
}
