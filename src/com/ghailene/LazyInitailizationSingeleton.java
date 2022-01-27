package com.ghailene;

public class LazyInitailizationSingeleton {
    private static LazyInitailizationSingeleton  instance;

    private LazyInitailizationSingeleton(){

    }

    public static LazyInitailizationSingeleton getInstance(){
        if (instance ==null){
            System.out.println("Creation new instance of the class lazy");
           instance = new LazyInitailizationSingeleton();
            return instance;
        }
        System.out.println("returning the instance of  the class lazy");
        return instance;
    }


}
