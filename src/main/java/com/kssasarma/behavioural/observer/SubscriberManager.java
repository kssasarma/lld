package com.kssasarma.behavioural.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubscriberManager {
    Map<String, ArrayList<Subscriber>> listeners = new HashMap<>();

    public SubscriberManager(String... operations) {
        for (String operation : operations) {
            listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String event, Subscriber listener) {
        ArrayList<Subscriber> users = listeners.get(event);
        users.add(listener);
    }
}
