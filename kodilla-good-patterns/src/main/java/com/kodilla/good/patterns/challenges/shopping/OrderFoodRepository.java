package com.kodilla.good.patterns.challenges.shopping;

import java.util.ArrayList;

public class OrderFoodRepository implements ShoppingRepository {

    private ArrayList<Order> orderFoodRepository = new ArrayList<>();

    public void addToRepository(Order order) {
        orderFoodRepository.add(order);
    }
}
