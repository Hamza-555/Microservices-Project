package com.hamza.microservicesproject.repository;

import com.hamza.microservicesproject.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String > {
}
