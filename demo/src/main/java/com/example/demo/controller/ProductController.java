package com.example.demo.controller;

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
        
    }
    
    
}
