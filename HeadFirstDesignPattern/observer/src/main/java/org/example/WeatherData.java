package org.example;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList observers;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<observers.size();i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(age);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(int age){
        this.age = age;
        measurementsChanged();
    }
}
