package com.kssasarma.structural.flyweight;

public class Fighter implements Sprite {
    private FighterRank rank;

    public Fighter(FighterRank rank) {
        this.rank = rank;
    }

    @Override
    public void draw() {
        System.out.println("Drawing fighter");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving fighter to position " + x + ", " + y);
    }

    public FighterRank getRank(){
        return this.rank;
    }
}
