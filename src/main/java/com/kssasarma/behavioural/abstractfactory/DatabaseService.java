package com.kssasarma.behavioural.abstractfactory;

public class DatabaseService implements IService {
    @Override
    public String runService() {
        return "Running Database Service";
    }
}