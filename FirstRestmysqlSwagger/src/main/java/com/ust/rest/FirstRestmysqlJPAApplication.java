package com.ust.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.resource.Product;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication // Begining of the spring application context.
@EnableSwagger2
public class FirstRestmysqlJPAApplication implements CommandLineRunner {
	@Autowired
	ProductRepository repo;
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctxt = SpringApplication.run(FirstRestmysqlJPAApplication.class, args);
		for(String str: args) {
			System.out.println(str);
		}
		boolean found= ctxt.containsBean("productRespository");
		System.out.println(found);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("from command line Runner");
		List<Product> products =repo.findAll();
		System.out.println(products.size());
		
	}

}
