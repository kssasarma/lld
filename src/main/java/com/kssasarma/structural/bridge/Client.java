package com.kssasarma.structural.bridge;

public class Client {
    public static void main(String[] args) {

        App app1 = new Facebook(new IOS());
        App app2 = new Instagram(new Andriod());

        app1.runApp();
        app2.runApp();
    }
}
