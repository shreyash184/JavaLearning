package com.shreyash.JDBC.DAO;

import com.shreyash.JDBC.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SpringJDBCProductDAO implements IProductDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private RowMapper<Product> productRowMapper;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Value("${sql.product.insert}")
    private String insertSql;

    @Override
    public Product createProduct(Product product) {
        MapSqlParameterSource in = new MapSqlParameterSource();
        in.addValue("id", product.getId());
        in.addValue("name", product.getName());
        in.addValue("price", product.getPrice());

        namedParameterJdbcTemplate.update(insertSql, in);

        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        System.out.println("This is Spring JDBC");
        String query = "Select * from product";
        List<Product> products = jdbcTemplate.query(query, productRowMapper);
        return products;
    }
}
