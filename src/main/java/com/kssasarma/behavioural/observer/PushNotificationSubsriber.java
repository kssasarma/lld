package com.kssasarma.behavioural.observer;

public class PushNotificationSubsriber implements Subscriber {
    private String name;
    private String deviceId;

    public PushNotificationSubsriber(String name, String deviceId) {
        this.name = name;
        this.deviceId = deviceId;
    }

    @Override
    public void notify(String eventType, String file) {
        System.out.println("Push Notification to Device " + deviceId + ": Hello " + name + ", the file " + file
                + " has been " + eventType + "ed.");
    }

}
