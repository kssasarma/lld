package com.kssasarma.behavioural.Singleton;

public class SingletonThreadSafeTest {

    public static void main(String[] args) {
        SingletonThreadSafe singleton1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe singleton2 = SingletonThreadSafe.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same. Singleton works!");
        } else {
            System.out.println("Instances are different. Singleton failed!");
        }
    }

}
