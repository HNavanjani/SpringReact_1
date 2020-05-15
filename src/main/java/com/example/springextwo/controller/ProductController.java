package com.example.springextwo.controller;

import com.example.springextwo.model.Product;
import com.example.springextwo.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sliit/products")
public class ProductController {

    private ProductService ps;

    public ProductController(ProductService productService){
        ps = productService;
    }

    @GetMapping(value = "/")
    public List<Product> getAllProducts(){
        return ps.findAll();
    }

    @GetMapping(value = "/{id}")
    public Product getProductById(@PathVariable int id){
        return ps.findById(id);
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> createProduct(@RequestBody Product p){
        ps.createProduct(p);
        return new ResponseEntity<>("Product added successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteProduct(@PathVariable int id){
        ps.deleteProduct(ps.findById(id));
    }



    /*
    @RequestMapping("/products")
    public String getProducts(){
        return "product list";
    }


    @RequestMapping("/products/{id}")
    public String getProduct(@PathVariable("id") int id){
        return "Product is: " + id;
    }

    @RequestMapping("/products")
    public String getProductByRequest(@RequestParam int id){
        return "Product is:" +id;
    }
    */

}



