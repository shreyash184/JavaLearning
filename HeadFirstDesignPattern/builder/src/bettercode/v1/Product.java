package bettercode.v1;

import java.util.List;

public class Product {
    public String name;
    public String desc;
    public int price;
    public String brand;
    public String category;
    public List<String> images;

    public Product(){

    }

    public void setName(String name){
        this.name = name;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setImages(List<String> images){
        this.images =  images;
    }
}
