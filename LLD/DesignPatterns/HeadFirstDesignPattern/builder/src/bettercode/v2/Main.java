package bettercode.v2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Object> mp =  new HashMap<>();
        mp.put("name", "Iphone");
        mp.put("desc", "This is iphone");
        mp.put("price", 1000);
        mp.put("brand", "apple");
        mp.put("category", "mobile");

        Product p = new Product(mp);

        System.out.println(p.price);

    }
}
