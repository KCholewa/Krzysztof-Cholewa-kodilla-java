package com.kodilla.good.patterns.challenges.foodShop;

import java.time.LocalDate;

public class OrderRequest {

    private User user;
    private LocalDate localDate;
    private Product product;
    private int qty;

    public OrderRequest(User user, Product product, int qty, LocalDate localDate) {
        this.user = user;
        this.product = product;
        this.qty = qty;
        this.localDate = localDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

}
