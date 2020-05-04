package com.kodilla.good.patterns.challenges.foodShop;


import java.time.LocalDate;

public class SampleOrder {

    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski");
        LocalDate localDate = LocalDate.now();
        Product product = new Product("Strawberry Jam");
        int qty = 1;

        return new OrderRequest(user, product, qty, localDate);
    }
}
