package org.example;

public class Singleton {

    private static Singleton unique;
    private Singleton(){
        System.out.println("First time initiation then constructor wont be called");
    }

    public static Singleton getInstance(){
        if(unique == null){
            unique =  new Singleton();
        }
        return unique;
    }
}
