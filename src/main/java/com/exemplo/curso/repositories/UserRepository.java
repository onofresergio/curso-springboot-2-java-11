package com.exemplo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
