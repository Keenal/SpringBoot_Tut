package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.Product;
import com.example.demo.services.ProductJPARepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private ProductJPARepository productService;

    @GetMapping("/welcome")
    public String sayHi() {
        return "Welcome to the Product Page";
    }

    // Jackson converts POJO's to JSON
    @GetMapping("/product")
    public Product getProduct() {
        Product myProduct = new Product(1, "A", 10);
        return myProduct;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
    	return productService.findAll();
    }
    
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
    	return productService.findById(id).get();
    	
    }
    

    @DeleteMapping("/products/{id}")
    public String deleteProductById(@PathVariable int id) {
    	productService.deleteById(id);
    	return "1";
    }
    
    @PostMapping("/products")
    public String addNewProduct(@RequestBody Product product) {
    	productService.save(product);
    	return "OK";
    }
    
    
    
}
