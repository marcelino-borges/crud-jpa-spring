package com.marcelino.crudbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelino.crudbackend.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
