package bettercode.v3;

import java.util.List;

public class Product {

    public String name;
    public String desc;
    public int price;
    public String brand;
    public String category;

    public Product(Builder b){
        this.name = b.name;
        this.desc = b.desc;
        if(b.price > 0){
            this.price = b.price;
        }
        this.brand = b.brand;
        this.category = b.category;
    }
}
