package org.example.observer;

import org.example.subject.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElemenrts{
    private int age;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Updated age is : " + this.age);
    }

    @Override
    public void update(int age) {
        this.age = age;
        display();
    }
}
