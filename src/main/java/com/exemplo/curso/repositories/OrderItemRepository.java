package com.exemplo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
