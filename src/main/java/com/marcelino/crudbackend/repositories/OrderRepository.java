package com.marcelino.crudbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelino.crudbackend.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
