package com.example.springextwo.service;

import com.example.springextwo.model.Product;
import com.example.springextwo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository pr;

    @Override
    public void createProduct(Product p) {
        pr.save(p);

    }

    @Override
    public void deleteProduct(Product p) {
        pr.delete(p);

    }

    @Override
    public List<Product> findAll() {
        return pr.findAll();
    }

    @Override
    public Product findById(int id) {
        return pr.findById(id);
    }
}
