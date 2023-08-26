package org.example;

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