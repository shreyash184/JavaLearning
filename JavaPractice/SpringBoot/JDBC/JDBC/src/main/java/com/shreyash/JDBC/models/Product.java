package com.shreyash.JDBC.models;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(){

    }

    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return this.id;
    }

    public double getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name=" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
