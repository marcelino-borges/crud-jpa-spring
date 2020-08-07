package com.marcelino.crudbackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelino.crudbackend.entities.Order;
import com.marcelino.crudbackend.services.OrderService;

@RestController 
@RequestMapping(value = "/orders") //"localhost:8080/users"
public class OrderResource {

	@Autowired
	private OrderService service;
	
	@GetMapping //Annotation que serve de endpoint para a request "localhost:8080/users"
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order order = service.findById(id);
		return ResponseEntity.ok().body(order);
	}
}
