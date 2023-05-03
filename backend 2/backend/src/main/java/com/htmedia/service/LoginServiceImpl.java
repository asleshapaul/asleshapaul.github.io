package com.htmedia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htmedia.repository.PersonRepository;


@Service
public class LoginServiceImpl implements LoginService{

	
	@Autowired
	PersonRepository personRepository;
	@Override
	public boolean authenticate(String email, String password) {
		// TODO Auto-generated method stub
		System.out.println(email+" " +password);
		if(personRepository.authenticate(email, password) != null)
			{
			return true;
			}
		
		return false;
			
		
	}

}
