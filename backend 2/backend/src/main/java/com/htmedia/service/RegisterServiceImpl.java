package com.htmedia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htmedia.entity.Person;
import com.htmedia.repository.PersonRepository;


@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
PersonRepository personRepository;
	
	@Override
	public String register(Person person) {
		// TODO Auto-generated method stub
		if(personRepository.findByEmail(person.getEmail())==null)
		{personRepository.save(person);
		return "added";
		}
		else {
			return "exist";
		}
	}

}
