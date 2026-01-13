package com.kssasarma.structural.proxy;

public class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        System.out.println("ProxyImage Displaying " + fileName);
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
        System.out.println("ProxyImage Displayed " + realImage);
    }
}
