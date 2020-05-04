package com.kodilla.good.patterns.challenges.foodShop;

import com.kodilla.good.patterns.challenges.foodShop.suppliers.ExtraFoodShop;

public class OrderService {


    public static void main(String[] args) {

        SampleOrder sampleOrder = new SampleOrder();
        OrderRequest orderRequest = sampleOrder.retrieve();
        FoodSupplier shop = new ExtraFoodShop();


        OrderProcessor orderProcessor = new OrderProcessor(shop);
        OrderDto orderDto = orderProcessor.orderProcess(orderRequest);
        System.out.println(orderDto);

    }
}
