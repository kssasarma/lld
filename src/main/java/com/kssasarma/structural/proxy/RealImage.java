package com.kssasarma.structural.proxy;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        System.out.println("RealImage constructor called");
        this.fileName = fileName;
    }

    public void display() {
        System.out.println("Real Image Displaying " + fileName);
    }
}