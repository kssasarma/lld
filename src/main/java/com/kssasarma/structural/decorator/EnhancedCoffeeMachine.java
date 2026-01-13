package com.kssasarma.structural.decorator;

public class EnhancedCoffeeMachine implements CoffeeMachine {
    private NormalCoffeeMachine machine;

    public EnhancedCoffeeMachine(NormalCoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public void makeSmallCoffee() {
        machine.makeSmallCoffee();
        System.out.println("Enhanced coffee machine: Adding extra flavor to small coffee");
    }

    @Override
    public void makeLargeCoffee() {
        machine.makeLargeCoffee();
        System.out.println("Enhanced coffee machine: Adding extra flavor to large coffee");
    }

    // Extended functionality
    public void makeMilkCoffee() {
        System.out.println("Enhanced coffee machine: Making milk coffee");
        machine.makeLargeCoffee();
        System.out.println("Enhanced coffee machine: Adding milk to the coffee");
    }

}
