package com.kssasarma.behavioural.Singleton;

public class SingletonLazyTest {
    public static void main(String[] args) {
        SingletonLazy singleton1 = SingletonLazy.getInstance();
        SingletonLazy singleton2 = SingletonLazy.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same. Singleton works!");
        } else {
            System.out.println("Instances are different. Singleton failed!");
        }
    }
}
