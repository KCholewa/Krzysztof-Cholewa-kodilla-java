package com.kodilla.good.patterns.challenges.foodShop.suppliers;

import com.kodilla.good.patterns.challenges.foodShop.FoodSupplier;
import com.kodilla.good.patterns.challenges.foodShop.OrderRequest;
import com.kodilla.good.patterns.challenges.foodShop.Randomizer;


public class HealthyShop implements FoodSupplier {

    public boolean process(OrderRequest orderRequest) {

        Randomizer randomizer = new Randomizer();
        boolean transactionDone = randomizer.randomBoolean();

        if (transactionDone) {
            System.out.println("\nTransaction was made successfully");
            return true;
        } else {
            System.out.println("Transaction didn't go through");
            return false;
        }
    }
}
