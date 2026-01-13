package com.kssasarma.structural.composite;

public class Client {
    public static void main(String[] args) {

        Composite computer = new Composite("Computer");

        Equipement processor = new Equipement("Processor", 300);
        Equipement cpu = new Equipement("CPU", 250);
        Equipement ram = new Equipement("RAM", 100);
        Equipement hdd = new Equipement("HDD", 150);
        computer.addEquipement(cpu).addEquipement(ram).addEquipement(hdd).addEquipement(processor);

        Composite peripherals = new Composite("Peripherals");
        Equipement mouse = new Equipement("Mouse", 20);
        Equipement keyboard = new Equipement("Keyboard", 30);
        peripherals.addEquipement(mouse);
        peripherals.addEquipement(keyboard);
        computer.addEquipement(peripherals);

        System.out.println("Total price of " + computer.getName() + ": $" + computer.getPrice());
    }
}
