package com.kssasarma.creational.prototype;

public class Client {
    public static void main(String[] args) {
        Vehicle car1 = new Car(4, 500000, "Red");
        Vehicle car2 = car1.clone();

        System.out.println(car1 == car2); // false
        System.out.println("Car1 is clone of Car2: " + car1.isClone(car2));

        Vehicle bicycle1 = new Bicycle(2, 20000, true);
        Vehicle bicycle2 = bicycle1.clone();
        System.out.println(bicycle1 == bicycle2); // false
        System.out.println("Bicycle1 is clone of Bicycle2: " + bicycle1.isClone(bicycle2));

        System.out.println("Car1 is clone of Bicycle1: " + car1.isClone(bicycle1));
    }
}
