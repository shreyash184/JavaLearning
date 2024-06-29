package org.example.decorator;

import org.example.Beverage;
import org.example.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return beverage.cost() + 2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "plus milk";
    }
}
