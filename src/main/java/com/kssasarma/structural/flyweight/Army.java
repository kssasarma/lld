package com.kssasarma.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Fighter> army = new ArrayList<>();

    public void spawnFighter(FighterRank rank) {
        Fighter f = FighterFactory.getFighter(rank);
        army.add(f);
    }

    public void drawArmy() {
        for (Fighter fighter : army) {
            switch (fighter.getRank()) {
                case MAJOR:
                    System.out.println("Major");
                    break;
                default:
                    break;
            }
        }
    }
}
