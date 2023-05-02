package com.ust.rest.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ust.rest.resource.Product;
@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
	//In summary, this code is defining a repository interface for managing Product objects in a MongoDB database using the Spring Data MongoDB library.

}
