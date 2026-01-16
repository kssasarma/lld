package com.kssasarma.behavioural.strategy;

public class Executer {

    public PrintStrategy printStrategy;

    public Executer(PrintStrategy printStrategy) {
        this.printStrategy = printStrategy;
    }

    public void printString(String input) {
        String formattedString = printStrategy.formatString(input);
        System.out.println(formattedString);
    }

}
