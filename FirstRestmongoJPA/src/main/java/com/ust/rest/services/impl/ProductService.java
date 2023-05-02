package com.ust.rest.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.resource.Product;
import com.ust.services.interfaces.ProductServiceIface;
@Service // Since service is a component
public class ProductService implements ProductServiceIface {
	@Autowired
	ProductRepository repository;
	public Product getProduct(String ProductId) {
		Optional<Product> optional=repository.findById(ProductId);
		if(optional.isPresent())
		{
			return optional.get();
			
		}
		else
		{
			return null;
		}
	}
	
		
//	}
	public List<Product> getProducts(){
		return repository.findAll();
		
	}
	public Product add(Product product) {
		
		 return repository.save(product);
		
	}
	public Product updateProduct(Product product) {
		return repository.save(product);
	}
	public void deleteProduct(String productId) {
		repository.deleteById(productId);
	}

}