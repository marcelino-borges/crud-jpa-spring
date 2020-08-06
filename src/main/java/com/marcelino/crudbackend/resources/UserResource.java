package com.marcelino.crudbackend.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelino.crudbackend.entities.User;

@RestController 
@RequestMapping(value = "/users") //"localhost:8080/users"
public class UserResource {

	@GetMapping //Annotation que serve de endpoint para a request "localhost:8080/users"
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		
		return ResponseEntity.ok().body(user);
	}
}
