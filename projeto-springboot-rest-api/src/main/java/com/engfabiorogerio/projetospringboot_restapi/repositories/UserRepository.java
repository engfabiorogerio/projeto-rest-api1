package com.engfabiorogerio.projetospringboot_restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.engfabiorogerio.projetospringboot_restapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
