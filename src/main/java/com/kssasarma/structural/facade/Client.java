package com.kssasarma.structural.facade;

public class Client {
    public static void main(String[] args) {

        NetworkAccessFacade facade = new NetworkAccessFacade();
        facade.communicate();
    }
}
