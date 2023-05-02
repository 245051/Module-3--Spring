package com.ust.rest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.resource.Product;
import com.ust.rest.services.impl.ProductService;

@RestController
@RequestMapping("/product/api.3.0")

public class ProductResources {
	@Autowired // Connect all the object implicitly
	ProductService service;
		@GetMapping//product/api.1.0/retrieve/
	@RequestMapping("/product/api.2.0/retrieve/{productId}")
	public ResponseEntity<Product> fetchProduct(@PathVariable String productId) {		
			return  ResponseEntity.ok(service.getProduct(productId));
	}
	//public Product fetchProduct;
	@GetMapping
	@RequestMapping("/retrieve/all")
	public ResponseEntity<List<Product>> fetchProducts(){
		List<Product> list = service.getProducts();
		return ResponseEntity.ok(list);
	}
	@PostMapping
	@RequestMapping(value="/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE) // restricting it to accept only json.
	public ResponseEntity<Product> addproduct(@RequestBody Product product)
	{
		
			
			 return new ResponseEntity<Product> (service.add(product),HttpStatus.ACCEPTED);
			
		
	}
	@PutMapping
	@RequestMapping(value="/update/{productId}",consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE) // restricting it to accept only json.)
	//By specifying the consumes and produces annotations, you can ensure that your controller methods only accept and return data in the expected format, which can help to prevent errors and ensure consistency in your application.
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
   }
	@DeleteMapping
	@RequestMapping(value="/delete/{productId}")
	public void deleteProduct(@PathVariable String productId) {
	
		 service.deleteProduct(productId);
	}
	
}
