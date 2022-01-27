package com.ghailene;

public class Main {

    public static void main(String[] args) {
	// write your code here

        EagerInitializationSingleton.getInstance();

        StaticBlockInitializationSingleton.getInstance();

        LazyInitailizationSingeleton.getInstance();
        LazyInitailizationSingeleton.getInstance();


        for (int i=0;i<5;i++){
            ThreadSafeSingleton.getInstance();
            ThreadSafeSingleton.getInstance();
            ThreadSafeSingleton.getInstance();
            ThreadSafeSingleton.getDoubleCheckInstance();
            ThreadSafeSingleton.getDoubleCheckInstance();
            ThreadSafeSingleton.getDoubleCheckInstance();
        }




    }
}
