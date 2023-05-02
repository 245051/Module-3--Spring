package com.ust.rest.resources;

import java.util.ArrayList;

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
import com.ust.rest.services.ProductService;

@RestController

public class ProductResources {
	@Autowired // Connect all the object implicitly
	ProductService service;
	
	@GetMapping//product/api.1.0/retrieve/
	@RequestMapping("/product/api.1.0/retrieve/{ProductId}")
	public Product fetchProduct(@PathVariable long ProductId) {
		return service.getProduct(ProductId);
	}
	public Product fetchProduct;
	@GetMapping
	@RequestMapping("/product/api.1.0/retrieve/all")
	public ArrayList<Product> fetchProducts(){
		return service.getProducts();
	}
	@PostMapping
	@RequestMapping(value="/product/api.1.0/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE) // restricting it to accept only json.
	public ResponseEntity<?> addproduct(@RequestBody Product product)
	{
		boolean result=service.add(product);
		if(result)
			{
			 return ResponseEntity.status(HttpStatus.CREATED).body(true);
			}
		else {
			return ResponseEntity.status(HttpStatus.CREATED).body(false);
		}
	}
	@PutMapping
	@RequestMapping(value="/product/api.1.0/update",consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE) // restricting it to accept only json.)
	public Product updateProduct(@RequestBody Product product) {
		return service.updateproduct(product);
	}
	@DeleteMapping
	@RequestMapping(value="/product/api.1.0/delete/{productId}")
	public void deleteProduct(@PathVariable long productId) {
		
		service.deleteProduct(productId);
	}
	

}
