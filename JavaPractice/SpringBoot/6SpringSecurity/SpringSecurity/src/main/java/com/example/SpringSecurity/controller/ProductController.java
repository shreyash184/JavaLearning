package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.entity.Product;
import com.example.SpringSecurity.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    ResponseEntity<Product> getById(@PathVariable Integer id){
        Product product = productService.getById(id);
        return ResponseEntity.ok(product);
    }
}
