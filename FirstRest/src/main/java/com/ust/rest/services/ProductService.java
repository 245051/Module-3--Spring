package com.ust.rest.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.resource.Product;
@Service // Since service is a component
public class ProductService {
	@Autowired
	ProductRepository repository;
	public Product getProduct(long ProductId) {
		return repository.getProduct(ProductId);
	
		
	}
	public ArrayList<Product> getProducts(){
		return repository.getProduct();
		
	}
	public boolean add(Product product) {
		
		return repository.addProduct(product);
	}
	public Product updateproduct(Product product) {
		return repository.updateproduct(product);
	}
	public void deleteProduct(long productId) {
		repository.delete(productId);
	}

}
