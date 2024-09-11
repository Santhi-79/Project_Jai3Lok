package com.efarms.authservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efarms.authservice.entity.Auth;

public interface AuthRepository extends JpaRepository<Auth, Long>{
	
	Optional<Auth> findByUsername(String username);

}
