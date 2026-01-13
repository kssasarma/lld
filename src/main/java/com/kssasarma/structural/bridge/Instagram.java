package com.kssasarma.structural.bridge;

public class Instagram implements App {
    private PhoneOS phoneOS;

    public Instagram(PhoneOS phoneOS) {
        this.phoneOS = phoneOS;
    }

    @Override
    public void runApp() {
        System.out.println();
        phoneOS.upload("Photo from Instagram");
        phoneOS.download("Instagram Feed");
        phoneOS.display("Instagram Stories");
        System.out.println();
    }

}
