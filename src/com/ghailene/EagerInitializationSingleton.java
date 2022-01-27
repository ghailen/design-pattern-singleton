package com.ghailene;

public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {
    }


    public static EagerInitializationSingleton getInstance(){
        System.out.println("Eager init of the class");
        return instance;
    }
}
