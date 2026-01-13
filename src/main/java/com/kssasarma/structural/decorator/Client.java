package com.kssasarma.structural.decorator;

public class Client {
    public static void main(String[] args) {
        NormalCoffeeMachine normal = new NormalCoffeeMachine();
        EnhancedCoffeeMachine enhanced = new EnhancedCoffeeMachine(normal);

        System.out.println("Using Normal Coffee Machine:");
        normal.makeSmallCoffee();
        normal.makeLargeCoffee();

        System.out.println("\nUsing Enhanced Coffee Machine:");
        enhanced.makeSmallCoffee();
        enhanced.makeLargeCoffee();
        enhanced.makeMilkCoffee();
    }
}