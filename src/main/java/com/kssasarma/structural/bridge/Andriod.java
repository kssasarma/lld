package com.kssasarma.structural.bridge;

public class Andriod implements PhoneOS {
    @Override
    public void upload(String data) {
        System.out.println("Uploading data to Andriod OS: " + data);
    }

    @Override
    public void download(String url) {
        System.out.println("Downloading data from Andriod OS: " + url);
    }

    @Override
    public void display(String data) {
        System.out.println("Displaying data on Andriod OS: " + data);
    }

}
