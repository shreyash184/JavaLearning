package com.shreyash.RestCrudOperations;

import com.shreyash.RestCrudOperations.services.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    @Primary
    public ProductService getProductService(){
        return new ProductService();
    }
}
