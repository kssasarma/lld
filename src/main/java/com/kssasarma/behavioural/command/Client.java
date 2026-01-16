package com.kssasarma.behavioural.command;

public class Client {
    public static void main(String[] args) {
        CommandProcessor processor = new CommandProcessor();
        processor.addCommand(new OrderAddCommand(1, 100.0))
                .addCommand(new OrderAddCommand(50, 50000))
                .addCommand(new OrderExecuteCommand(1))
                .addCommand(new OrderExecuteCommand(50));
        processor.execute();
    }
}
