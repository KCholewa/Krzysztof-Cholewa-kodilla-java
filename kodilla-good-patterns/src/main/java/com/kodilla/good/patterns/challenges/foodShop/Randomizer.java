package com.kodilla.good.patterns.challenges.foodShop;

import java.util.Random;

public class Randomizer {

    public boolean randomBoolean() {
        Random random = new Random();
        int randomDigit = random.nextInt(2);

        return randomDigit == 1;
    }
}
