package com.efarms.userService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efarms.userService.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);
	
	public List<User> findAllByOrderByCreatedAtDesc();

}




