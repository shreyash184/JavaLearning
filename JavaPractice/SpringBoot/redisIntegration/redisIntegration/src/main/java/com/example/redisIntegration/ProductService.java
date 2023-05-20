package com.example.redisIntegration;



import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {

    private static Logger LOGGER = LoggerFactory.getLogger(ProductService.class);

    private Map<Integer, Product> productMap;

    @PostConstruct
    public void init(){
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "laptop", 40000.00));
        productMap.put(2, new Product(2, "Mobile", 20000.00));
    }

    public Product getById(Integer id){
        LOGGER.info("Fectching from data source");
        return productMap.get(id);
    }
}
