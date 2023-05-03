package com.shreyash.JDBC.controllers;

import com.shreyash.JDBC.models.Product;
import com.shreyash.JDBC.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/v1/product")
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product productRequest) throws URISyntaxException, SQLException {
        Product product = productService.createProduct(productRequest);
//        URI uri = new URI("v1/product/"+ product.getId());
        return ResponseEntity.ok(product);
    }

    @GetMapping("/all")
    public List<Product> getAllProducts(){
        List<Product> products = productService.getProducts();
        return products;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer id){
        Product product = productService.getById(id);
        if(product == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable Integer id){
        Product product = productService.delete(id);
        if(product == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer id, @RequestBody Product productRequest){
        Product product = productService.update(id, productRequest);
        if(product == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product);
    }
}

