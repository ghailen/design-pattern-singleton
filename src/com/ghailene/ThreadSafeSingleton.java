package com.ghailene;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getInstance() {

        if (instance == null) {
            instance = new ThreadSafeSingleton();
            System.out.println("Thread safe new instance");
            return instance;
        }
        System.out.println("returning thread safe instance");
        return instance;
    }


    // deuxieme façon
    public static ThreadSafeSingleton getDoubleCheckInstance() {

        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                    System.out.println("Thread safe double check new instance");
                }
            }

            return instance;
        }
        System.out.println("returning thread safe double check instance");
        return instance;
    }
}
