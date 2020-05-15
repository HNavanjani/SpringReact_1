package com.example.springextwo.repository;

import com.example.springextwo.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
Product findById(int id);

}
