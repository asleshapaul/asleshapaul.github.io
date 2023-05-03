package com.htmedia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htmedia.entity.Person;
import com.htmedia.repository.PersonRepository;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	PersonRepository personRepository;
	@Override
	public Person getProfile(String email) {
		// TODO Auto-generated method stub
		return personRepository.findByEmail(email);
	}

}
