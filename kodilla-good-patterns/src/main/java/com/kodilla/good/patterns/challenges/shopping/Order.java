package com.kodilla.good.patterns.challenges.shopping;

import java.time.LocalDate;

public class Order {

    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski");
        LocalDate localDate = LocalDate.now();
        Product product = new Product("Tv");
        int qty = 1;

        return new OrderRequest(user, product, qty, localDate);
    }

}
