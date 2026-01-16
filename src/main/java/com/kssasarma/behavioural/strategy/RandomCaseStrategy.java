package com.kssasarma.behavioural.strategy;

import java.util.Random;

public class RandomCaseStrategy implements PrintStrategy {

    @Override
    public String formatString(String input) {
        String output = "";
        Random random = new Random();
        for (char c : input.toCharArray()) {
            if (random.nextBoolean()) {
                output += Character.toLowerCase(c);
            } else {
                output += Character.toUpperCase(c);
            }
        }
        return output;
    }

}
