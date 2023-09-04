package org.example;

public class SingletonThreaded {

    private volatile static SingletonThreaded singletonThreaded;

    private SingletonThreaded(){
        System.out.println("Print once while initilization");
    }

    public static SingletonThreaded getInstance(){
        if(singletonThreaded == null){
            synchronized (SingletonThreaded.class){
                if(singletonThreaded == null){
                    singletonThreaded = new SingletonThreaded();
                }
            }
        }
        return singletonThreaded;
    }

}
