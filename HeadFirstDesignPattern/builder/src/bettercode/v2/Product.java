package bettercode.v2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Product {
    public String name;
    public String desc;
    public int price;
    public String brand;
    public String category;
    public List<String> images;

    public Product(HashMap<String, Object> mp){
        if((int)mp.get("price") > 0){
            this.price = (int)mp.get("price");
        }
        this.name = (String)mp.get("name");
        this.desc = (String)mp.get("desc");
        this.brand = (String)mp.get("brand");
        this.category = (String)mp.get("category");
    }
}
