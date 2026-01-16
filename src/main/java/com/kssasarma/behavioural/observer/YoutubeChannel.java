package com.kssasarma.behavioural.observer;

import java.util.ArrayList;

public class YoutubeChannel {
    public ArrayList<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String eventType, String file) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(eventType, file);
        }
    }

    public void uploadVideo(String file) {
        System.out.println("Video Uploaded: " + file);
        notifySubscribers("upload", file);
    }
}
