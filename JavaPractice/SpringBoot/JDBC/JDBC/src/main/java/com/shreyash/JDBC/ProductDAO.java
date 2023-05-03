package com.shreyash.JDBC;

import com.shreyash.JDBC.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDAO {

    public Product createProductInTxn(Product product) throws SQLException {
        Connection con = null;
        boolean autoCommit = false;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "@Cj695123");
            autoCommit = con.getAutoCommit();
            con.setAutoCommit(false);
            String insertStatment = "INSERT INTO PRODUCT VALUES (?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(insertStatment);
            statement.setInt(1, product.getId());
            statement.setString(2, product.getName());
            statement.setDouble(3, product.getPrice());
            statement.execute();
            con.commit();
        }catch(SQLException exc){
            try{
                con.rollback();
            } catch (SQLException e){
                throw new RuntimeException(e);
            }
        } finally {
            try {
                con.setAutoCommit(autoCommit);
            } catch(SQLException e){
                throw new RuntimeException(e);
            }
        }
        return product;
    }

    public Product createProduct(Product product){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "@Cj695123");
            Statement statement = con.createStatement();
            String insertStatement = "insert into product values (" + product.getId() + ", '"+ product.getName() +"', "+ product.getPrice() +")";
            statement.execute(insertStatement);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally{
            if(con != null){
                try{
                    con.close();
                }catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return product;
    }

    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "@Cj695123");
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from product");
            while(resultSet.next()){
                Product product = new Product(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getDouble("price"));
                System.out.println(product);
                products.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(con != null){
                try{
                    con.close();
                } catch(SQLException e){
                    throw new RuntimeException(e);
                }
            }
        }
        return products;
    }
}
