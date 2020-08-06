package com.marcelino.crudbackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelino.crudbackend.entities.User;
import com.marcelino.crudbackend.services.UserService;

@RestController 
@RequestMapping(value = "/users") //"localhost:8080/users"
public class UserResource {

	@Autowired
	private UserService service;
	
	@GetMapping //Annotation que serve de endpoint para a request "localhost:8080/users"
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User user = service.findById(id);
		return ResponseEntity.ok().body(user);
	}
}
