package com.kssasarma.behavioural.command;

public class OrderAddCommand implements Command {
    int id;
    double price;

    public OrderAddCommand(int id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public void execute() {
        System.out.println("Order added with id: " + id + " and price: " + price);
    }

}
