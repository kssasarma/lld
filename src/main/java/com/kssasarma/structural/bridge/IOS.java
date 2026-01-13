package com.kssasarma.structural.bridge;

public class IOS implements PhoneOS {
    @Override
    public void upload(String data) {
        System.out.println("Uploading data to iOS: " + data);
    }

    @Override
    public void download(String url) {
        System.out.println("Downloading data from iOS: " + url);
    } 

    @Override
    public void display(String data) {
        System.out.println("Displaying data on iOS: " + data);
    }

}
