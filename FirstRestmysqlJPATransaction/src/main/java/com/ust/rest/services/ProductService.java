package com.ust.rest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.repository.UserRepository;
import com.ust.rest.resource.Product;
import com.ust.rest.resources.User;
@Service // Since service is a component
public class ProductService {
	@Autowired
	ProductRepository productrepository;
	@Autowired
	UserRepository userRepository;
	public Product getProduct(long ProductId) {
		Optional<Product> optional=productrepository.findById(ProductId);
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
		return productrepository.findAll();
	}
	@Transactional	
	public Product add(Product product) {
//		if(validate(product)) {  // another program soo..
//			return false;  // no need other than transaction
//		}
//		else {
//			
//			productrepository.save(product);
//			return true;
//		}
		Product productT=productrepository.save(product);
		adduser();
		return productT;
//		if(userT!=null && productT!=null ) {
//			
//			return true;
//		}
//		else
//		{
//			throw new RuntimeException("Record not inserted");
//		}
		//userRepository.save(user);
	}@Transactional(propagation=Propagation.REQUIRES_NEW)
	public boolean adduser() {
		
		User user =new User();
		user.setUserId(5L);
		user.setDataTime(System.currentTimeMillis()+" ");
		try {
			User userT = userRepository.save(user);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		//User userT=userRepository.save(user);
		return true;
		
		
	}
	public boolean validate(Product product)
	{
		if(product.getName().equals("Camera")) {
			return true;
			
		}else {
			return false;
		}
	}		
	public Product updateProduct(Product product) {
		return productrepository.save(product);
	}
	public void deleteProduct(long productId) {
		productrepository.deleteById(productId);
	}

}
