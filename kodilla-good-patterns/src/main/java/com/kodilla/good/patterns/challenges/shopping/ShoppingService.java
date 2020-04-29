package com.kodilla.good.patterns.challenges.shopping;

import java.time.LocalDate;

public interface ShoppingService {
    boolean createOrder (User user, Product product, int qty, LocalDate localDate);
}
