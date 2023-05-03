package com.htmedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.htmedia.entity.Person;
import com.htmedia.service.LoginService;
import com.htmedia.service.ProfileService;

@RestController
@CrossOrigin 
public class ProfileController {

	@Autowired
	ProfileService profileService;
 
	@GetMapping("/profile")
	Person login(@RequestParam String email) {
	return	profileService.getProfile(email);
		
	}
}
