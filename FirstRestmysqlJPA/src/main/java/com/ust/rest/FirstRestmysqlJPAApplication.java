package com.ust.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstRestmysqlJPAApplication {
static Logger logger=LoggerFactory.getLogger(FirstRestmysqlJPAApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FirstRestmysqlJPAApplication.class, args);
		logger.trace("Application Started Successfully");
		logger.debug("Application Started Successfully");
		logger.info("Application started successfully");
		logger.warn("Warning");
		logger.error("Application satrted Successfully");
		
	}

}
