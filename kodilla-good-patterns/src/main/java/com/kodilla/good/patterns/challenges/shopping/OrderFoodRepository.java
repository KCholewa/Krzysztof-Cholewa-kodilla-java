package com.kodilla.good.patterns.challenges.shopping;

import java.util.*;

public class OrderFoodRepository implements ShoppingRepository {

    private List<Order> orderFoodRepository = new ArrayList<>();

    public void addToRepository(Order order) {
        orderFoodRepository.add(order);
    }
}
