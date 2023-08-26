package org.example;

import org.example.concreteComponent.DarkRoast;
import org.example.decorator.Milk;

public class Main {
    public static void main(String[] args) {
        Beverage mydrink = new Milk(new Milk(new DarkRoast()));
        System.out.println(mydrink.cost());
    }
}