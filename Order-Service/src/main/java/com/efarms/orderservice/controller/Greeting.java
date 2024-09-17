package com.efarms.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Greeting {
	@GetMapping("/greet")
	public String greet() {
		return "Hello Welcome to the orders Page";
	}
}
