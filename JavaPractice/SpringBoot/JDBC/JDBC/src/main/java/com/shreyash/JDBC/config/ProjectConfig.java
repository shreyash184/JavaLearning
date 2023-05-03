package com.shreyash.JDBC.config;

import com.shreyash.JDBC.services.ProductService;
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
