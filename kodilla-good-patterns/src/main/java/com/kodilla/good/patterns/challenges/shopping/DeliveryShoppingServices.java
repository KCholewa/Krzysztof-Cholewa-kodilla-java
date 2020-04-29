package com.kodilla.good.patterns.challenges.shopping;

import java.time.LocalDate;

public class DeliveryShoppingServices implements ShoppingService {
    public boolean createOrder(User user, Product product, int qty, LocalDate localDate) {
        System.out.println("Order product: " +product.getProductName()+"\nCustomer: "+user.getName()
                +" " +user.getSurname()+"\nDate: "+localDate+"\nQty:"+qty);
        return true;
    }
}

