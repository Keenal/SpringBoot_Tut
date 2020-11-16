package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

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
        List<Product> myProducts = new ArrayList<>();
        Product myProduct1 = new Product(1, "A", 10);
        Product myProduct2 = new Product(1, "B", 30);
        Product myProduct3 = new Product(1, "C", 30);

        myProducts.add(myProduct1);
        myProducts.add(myProduct2);
        myProducts.add(myProduct3);
        
        return myProducts;
    }

    
    
    
}
