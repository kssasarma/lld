package com.kssasarma.behavioural.observer;

public class EmailSubscriber implements Subscriber {
    private String name;
    private String email;

    public EmailSubscriber(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void notify(String eventType, String file) {
        System.out.println(
                "Email to " + email + ": Hello " + name + ", the file " + file + " has been " + eventType + "ed.");
    }

}
