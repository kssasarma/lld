package com.kssasarma.creational.Singleton;

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe() {
        // private constructor to prevent instantiation
    }

    public static synchronized SingletonThreadSafe getInstance() {
        if (instance == null) {
            System.out.println("Creating new instance of SingletonThreadSafe");
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
}
