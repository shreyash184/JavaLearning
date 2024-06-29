package badcode;

import java.util.List;

public class Product {
    public String name;
    public String desc;
    public int price;
    public String brand;
    public String category;
    public List<String> images;

    public Product(String name, String desc, int price, String brand, String category, List<String> images){
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.images = images;
    }
}
