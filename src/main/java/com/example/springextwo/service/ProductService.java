package com.example.springextwo.service;

import com.example.springextwo.model.Product;

import java.util.List;

public interface ProductService {
    void createProduct(Product p);
    void deleteProduct(Product p);
    List<Product> findAll();
    Product findById(int id);
}
