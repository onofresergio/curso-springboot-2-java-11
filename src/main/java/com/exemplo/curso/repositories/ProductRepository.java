package com.exemplo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
