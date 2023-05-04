package com.shreyash.JDBC.DAO;

import com.shreyash.JDBC.models.Product;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public interface IProductDAO {

    public Product createProduct(Product product);
    public List<Product> getAllProducts();
}
