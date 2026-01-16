package com.kssasarma.behavioural.strategy;

public class Client {

    public static void main(String[] args) {
        Executer upperCaseExecuter = new Executer(new UpperCaseStrategy());
        upperCaseExecuter.printString("Hello Strategy Pattern");

        Executer lowerCaseExecuter = new Executer(new LowerCaseStrategy());
        lowerCaseExecuter.printString("Hello Strategy Pattern");

        Executer customExecuter = new Executer(new PrintStrategy() {
            @Override
            public String formatString(String input) {
                return "~~~ " + input + " ~~~";
            }
        });

        customExecuter.printString("Hello Strategy Pattern");

        Executer randomExecuter = new Executer(new RandomCaseStrategy());
        randomExecuter.printString("Hello Strategy Pattern");
    }

}
