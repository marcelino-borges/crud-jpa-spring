package com.marcelino.crudbackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelino.crudbackend.entities.Category;
import com.marcelino.crudbackend.services.CategoryService;

@RestController 
@RequestMapping(value = "/categories") //"localhost:8080/users"
public class CategoryResource {

	@Autowired
	private CategoryService service;
	
	@GetMapping //Annotation que serve de endpoint para a request "localhost:8080/users"
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category category = service.findById(id);
		return ResponseEntity.ok().body(category);
	}
}
