package com.kssasarma.behavioural.observer;

public class Client {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber sub1 = new EmailSubscriber("Alice", "alice@example.com");
        channel.addSubscriber(sub1);

        Subscriber sub2 = new PushNotificationSubsriber("Bob", "device123");
        channel.addSubscriber(sub2);

        channel.uploadVideo("DesignPatterns.pdf");
    }
}
