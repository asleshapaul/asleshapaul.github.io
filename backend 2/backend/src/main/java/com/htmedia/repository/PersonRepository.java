package com.htmedia.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.htmedia.entity.Person;


public interface PersonRepository extends CrudRepository<Person,Long>{

	@Query("Select p from Person p WHERE p.email = :email and p.password = :password")
	Person authenticate(@Param("email") final String email,@Param("password") final String password);

	Person findByEmail(String email);

	
}
