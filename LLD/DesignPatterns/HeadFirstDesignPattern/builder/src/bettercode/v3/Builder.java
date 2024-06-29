package bettercode.v3;

import java.util.List;

public class Builder {
    public String name;
    public String desc;
    public int price;
    public String brand;
    public String category;

    public Builder(){

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return this.desc;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }
    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return this.category;
    }
}
