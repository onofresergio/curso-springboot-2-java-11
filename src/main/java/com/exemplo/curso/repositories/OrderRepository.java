package com.exemplo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
