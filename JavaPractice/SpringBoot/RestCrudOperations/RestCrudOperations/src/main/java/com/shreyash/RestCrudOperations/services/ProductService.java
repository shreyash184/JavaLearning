package com.shreyash.RestCrudOperations.services;

import com.shreyash.RestCrudOperations.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> productList;
    private int nextId = 4;

    public ProductService(){
        productList = new ArrayList<>();
        productList.add(new Product(1, "laptop", 50000.00));
        productList.add(new Product(2, "mobile", 10000.00));
        productList.add(new Product(3, "tablet", 30000.00));
    }

    public List<Product> getProducts(){
        return productList;
    }

    public Product createProduct(Product product){
        nextId++;
        product.setId(nextId);
        productList.add(product);
        return product;
    }

    public Product getById(Integer id){
        Product result = null;
        for(Product product : productList){
            if(product.getId() == id){
                result = product;
                break;
            }
        }
        return result;
    }

    public Product delete(Integer id){
        Product result = null;
        for(Product product : productList){
            if(product.getId() == id){
                result = product;
            }
        }
        productList.remove(result);
        return result;
    }

    public Product update(Integer id, Product productToUpdate){
        Product result = null;
        for(Product product : productList){
            if(product.getId() == id){
                result = product;
            }
        }
        if(result != null){
            result.setName(productToUpdate.getName());
            result.setPrice(productToUpdate.getPrice());
        }
        return result;
    }
}
