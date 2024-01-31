import badcode.Product;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product p = new Product("iphone", "This is iphone", 1000, "apple", "mobile", new ArrayList<>());
        System.out.println(p.name);
    }
}