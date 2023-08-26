package org.example;

import org.example.observer.CurrentConditionDisplay;
import org.example.observer.Observer;
import org.example.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentAge = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(23);
        System.out.println(" ");
        weatherData.setMeasurements(45);
        System.out.println(" ");
        weatherData.setMeasurements(65);
    }
}