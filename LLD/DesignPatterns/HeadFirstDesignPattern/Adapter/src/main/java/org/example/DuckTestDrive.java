package org.example;

import org.example.adaptee.Turkey;
import org.example.adaptee.WildTurkey;
import org.example.adapter.TurkeyAdapter;
import org.example.target.MallardDuck;
import org.example.target.Duck;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says ...");
        turkey.gobble();
        turkey.fly();

        System.out.println("Duck says....");
        testDuck(duck);

        System.out.println("TurkeyAdapter says....");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
