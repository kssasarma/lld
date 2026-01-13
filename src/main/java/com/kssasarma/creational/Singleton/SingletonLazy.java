package com.kssasarma.creational.Singleton;

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
        // private constructor to prevent instantiation
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            System.out.println("Creating new instance of SingletonLazy");
            instance = new SingletonLazy();
        }
        return instance;
    }
}
