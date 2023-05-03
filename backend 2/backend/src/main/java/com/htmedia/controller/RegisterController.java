package com.htmedia.controller;

import java.util.Base64;
import java.util.Base64.Decoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htmedia.entity.Person;
import com.htmedia.model.PersonModel;
import com.htmedia.service.RegisterService;

@CrossOrigin
@RestController
public class RegisterController {

@Autowired
RegisterService registerService;
	
@PostMapping("/register")
ResponseEntity<String> register(@RequestBody PersonModel person) 
	{	
	Decoder decoder = Base64.getDecoder();
	Person person2=new Person();
	if(person.getImage()!=null) {
	byte[] bytes = decoder.decode(person.getImage());
	person2.setImage(bytes);
		}
		person2.setEmail(person.getEmail());
		person2.setName(person.getName());
		person2.setPassword(person.getPassword());
	System.out.println(person2);
	String string=registerService.register(person2);
if(string=="added")
	return new ResponseEntity<String>("Register Successfully",HttpStatus.OK);
else if(string=="exist") {
	return new ResponseEntity<String>("Already Exist",HttpStatus.CONFLICT);}
	else {
		return new ResponseEntity<String>("Error Occured",HttpStatus.INTERNAL_SERVER_ERROR);
			}

}

}
