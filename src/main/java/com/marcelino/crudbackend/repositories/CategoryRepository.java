package com.marcelino.crudbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelino.crudbackend.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
