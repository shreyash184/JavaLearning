package org.example;

public class Light {
    private String type;
    public Light(String type){
        this.type = type;
    }

    public void on(){
        System.out.println("The light is turned on");
    }

    public void off(){
        System.out.println("The light is turned off");
    }
}
