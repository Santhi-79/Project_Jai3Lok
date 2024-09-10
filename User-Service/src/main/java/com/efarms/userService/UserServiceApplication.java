package com.efarms.userService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EntityScan(basePackages = " com.efarms.userService")
@ComponentScan(basePackages = "com.efarms.userService") // Make sure this is correct
public class UserServiceApplication {
   
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
