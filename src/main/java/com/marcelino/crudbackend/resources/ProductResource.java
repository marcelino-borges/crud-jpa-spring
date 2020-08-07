package com.marcelino.crudbackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelino.crudbackend.entities.Product;
import com.marcelino.crudbackend.services.ProductService;

@RestController 
@RequestMapping(value = "/products") //"localhost:8080/products"
public class ProductResource {

	@Autowired
	private ProductService service;
	
	@GetMapping //Annotation que serve de endpoint para a request "localhost:8080/products"
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product product = service.findById(id);
		return ResponseEntity.ok().body(product);
	}
}
