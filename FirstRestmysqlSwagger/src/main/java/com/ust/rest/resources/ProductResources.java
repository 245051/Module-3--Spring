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
import com.ust.rest.services.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/product/api.2.0")

@Api(value="Customer Service API 2.0",description = "Rest endpoints for producut API")
public class ProductResources {
	@Autowired // Connect all the object implicitly
	ProductService service;
		@GetMapping//product/api.2.0/retrieve/
	@RequestMapping("/product/api.2.0/retrieve/{productId}")
		@ApiOperation(value="Accepts Product Identity and Returns the Product Entity")
	public Product fetchProduct(@PathVariable long productId) {		
			return service.getProduct(productId);
	}
	//public Product fetchProduct;
	@GetMapping
	@RequestMapping("/retrieve/all")
	@ApiOperation(value="Accepts Product Identity and Returns the Product Entity")
	public List<Product> fetchProducts(){		
		return service.getProducts();
	}
	@PostMapping
	@RequestMapping(value="/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE) // restricting it to accept only json.
	@ApiOperation(value="Accepts Product Identity and Returns the Product Entity")
	public ResponseEntity<?> addproduct(@RequestBody Product product)
	{
//		Product result=service.add(product);
//		if(result)
//			{
//			 return ResponseEntity.status(HttpStatus.CREATED).body(true);
//			}
//		else {
//			return ResponseEntity.status(HttpStatus.CREATED).body(false);
//		}
		Exception exception=null;
		Product tempProduct=null;
		try {
			tempProduct = service.add(product);
			
		}catch(Exception e)
		{
			exception =e;
		}
		if(tempProduct != null){
			return ResponseEntity.status(HttpStatus.CREATED).body(tempProduct);
		}
		else
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception);
	}
	@PutMapping
	@RequestMapping(value="/update/{productId}",consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE) // restricting it to accept only json.)
	@ApiOperation(value="Update Product  and Returns the Product Entity")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
   }
	@DeleteMapping
	@RequestMapping(value="/delete/{productId}")
	@ApiOperation(value="Delete Product  and Returns the Product Entity")
	public void deleteProduct(@PathVariable long productId) {
	
		service.deleteProduct(productId);
	}
	
}
