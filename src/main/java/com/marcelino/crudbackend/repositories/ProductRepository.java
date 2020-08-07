package com.marcelino.crudbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelino.crudbackend.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
