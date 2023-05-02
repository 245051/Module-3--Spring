package com.ust.awsbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@SpringBootApplication
public class FirstRestActuator1Application {

	public static void main(String[] args) {
		SpringApplication.run(FirstRestActuator1Application.class, args);
	}

	@GetMapping
	@RequestMapping("\test")
		public String message() {
		return "success";
		}
		
	}

