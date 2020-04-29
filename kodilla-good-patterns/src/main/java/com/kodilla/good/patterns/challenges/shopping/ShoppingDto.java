package com.kodilla.good.patterns.challenges.shopping;

public class ShoppingDto {

    private User user;
    private Product product;
    private boolean isTransactionDone;

    public ShoppingDto(User user, Product product, boolean isTransactionDone) {
        this.user = user;
        this.product = product;
        this.isTransactionDone = isTransactionDone;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isTransactionDone() {
        return isTransactionDone;
    }

}
