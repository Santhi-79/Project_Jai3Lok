package com.efarms.userService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efarms.userService.entity.User;
import com.efarms.userService.exception.UserException;
import com.efarms.userService.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
private UserService userService;
	
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	
	@GetMapping("/profile")
	public ResponseEntity<User> getUserProfileHandler(@RequestHeader("Authorization") String jwt) throws UserException{

		System.out.println("/api/users/profile");
		User user=userService.findUserProfileByJwt(jwt);
		return new ResponseEntity<User>(user,HttpStatus.ACCEPTED);
}
	/* have to remove after below method*/
	@GetMapping("/profile/user")
	public ResponseEntity<User> getUserProfileHandler_user(@RequestHeader("Authorization") String jwt) throws UserException{

		System.out.println("/api/users/profile");
		User user=userService.findUserProfileByJwt(jwt);
		return new ResponseEntity<User>(user,HttpStatus.ACCEPTED);
}
}
