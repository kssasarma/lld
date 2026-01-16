package com.kssasarma.behavioural.observer;

public interface Subscriber {
    void notify(String eventType, String file);
}
