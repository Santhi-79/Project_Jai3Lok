package com.efarms.userService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.efarms.userService.entity.User;
import com.efarms.userService.exception.UserException;

@Service
public interface UserService {
public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
