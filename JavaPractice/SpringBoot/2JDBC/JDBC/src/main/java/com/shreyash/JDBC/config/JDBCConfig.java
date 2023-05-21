package com.shreyash.JDBC.config;

import com.shreyash.JDBC.DAO.IProductDAO;
import com.shreyash.JDBC.DAO.JDBCProductDAO;
import com.shreyash.JDBC.DAO.SpringJDBCProductDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JDBCConfig {

    @Bean
    @Primary
    public IProductDAO getJDBCProductDao(){
        return new JDBCProductDAO();
    }

    @Bean
    public IProductDAO getSpringJDBCProductDao(){
        return new SpringJDBCProductDAO();
    }
}
