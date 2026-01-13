package com.kssasarma.structural.bridge;

public class Facebook
        implements App {
    private PhoneOS phoneOS;

    public Facebook(PhoneOS phoneOS) {
        this.phoneOS = phoneOS;
    }

    @Override
    public void runApp() {
        System.out.println();
        phoneOS.upload("Photo from Facebook");
        phoneOS.download("https://facebook.com/somecontent");
        phoneOS.display("Facebook News Feed");
        System.out.println(); 
    }

}
