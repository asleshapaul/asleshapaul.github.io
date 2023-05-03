package com.htmedia.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htmedia.entity.Person;
import com.htmedia.service.LoginService;


@RestController
@CrossOrigin 
public class LoginController {

	@Autowired
	LoginService loginService;
 
	@PostMapping("/login")
	ResponseEntity<String> login(@RequestBody Person person) {
		System.out.println(person);
		if(loginService.authenticate(person.getEmail(),person.getPassword()))
			return new ResponseEntity<>("Login Successfully", HttpStatus.OK);
		
		return new ResponseEntity<>("Login Unsuccessful", HttpStatus.UNAUTHORIZED);			
	}
}
