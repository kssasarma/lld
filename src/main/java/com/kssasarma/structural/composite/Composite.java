package com.kssasarma.structural.composite;

import java.util.ArrayList;

public class Composite extends Equipement {

    private ArrayList<Equipement> equipements = new ArrayList<>();

    public Composite(String name) {
        super(name, 0);
    }

    public Composite addEquipement(Equipement equipment) {
        equipements.add(equipment);
        return this;
    }

    @Override
    public int getPrice() {
        int totalPrice = 0;
        for (Equipement equipment : equipements) {
            totalPrice += equipment.getPrice();
        }
        return totalPrice;
    }

}