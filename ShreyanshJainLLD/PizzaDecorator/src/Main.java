//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import com.sun.source.tree.ForLoopTree;

interface FootItem{
    public String getDesc();
    public double getPrice();
}

class Pizza implements FootItem{
    public String getDesc(){
        return "Pizza";
    }

    public double getPrice(){
        return 100;
    }
}

class Burger implements FootItem{
    public String getDesc(){
        return "Burger";
    }

    public double getPrice(){
        return 50;
    }
}

abstract class Decorator implements FootItem{
    FootItem foodItem;

    public Decorator(FootItem foodItem) {
        this.foodItem = foodItem;
    }
}


class Cheese extends Decorator{
    public double price;
    public Cheese(FootItem footItem, double price){
        super(footItem);
        this.price = price;
    }

    @Override
    public String getDesc() {
        return foodItem.getDesc() + " Cheese";
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + this.price ;
    }
}

class Sauce extends Decorator{
    public double price;
    public Sauce(FootItem footItem, double price){
        super(footItem);
        this.price = price;
    }

    @Override
    public String getDesc() {
        return foodItem.getDesc() + " Sauce";
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + this.price ;
    }
}

public class Main {
    public static void main(String[] args) {
        FootItem pizza = new Pizza();

        FootItem cheesePizza = new Cheese(pizza, 10);
        FootItem cheeseSaucePizza = new Sauce(cheesePizza, 5);

        System.out.println(cheeseSaucePizza.getDesc());
        System.out.println(cheeseSaucePizza.getPrice());
    }
}