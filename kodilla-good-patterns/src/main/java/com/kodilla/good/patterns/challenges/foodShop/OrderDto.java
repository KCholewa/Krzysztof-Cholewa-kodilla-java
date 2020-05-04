package com.kodilla.good.patterns.challenges.foodShop;


import java.time.LocalDate;

public class OrderDto {

    private User user;
    private Product product;
    private int qty;
    private LocalDate localDate;
    private boolean isTransactionDone;


    public OrderDto(User user, Product product, int qty, LocalDate localDate, boolean isTransactionDone) {
        this.user = user;
        this.product = product;
        this.localDate = localDate;
        this.qty = qty;
        this.isTransactionDone = isTransactionDone;
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

    public boolean isTransactionDone() {
        return isTransactionDone;
    }

    @Override
    public String toString() {
        return  "\nuser: " + getUser().getName()+ " "+ getUser().getSurname()+
                "\nproduct: " + getProduct().getProductName()+
                "\nqty: " + getQty() +
                "\nlocalDate: " + getLocalDate() +
                "\nisTransactionDone: " + isTransactionDone();

    }
}
