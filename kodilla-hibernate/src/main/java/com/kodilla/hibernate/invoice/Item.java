package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    public Item() {
    }

    public Item(Product product, BigDecimal price, int quantity, BigDecimal value, Invoice invoice) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = value;
        this.invoice = invoice;
    }

    @Id
    @GeneratedValue
    @NotNull
    public int getId() {
        return id;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    @NotNull
    public BigDecimal getPrice() {
        return price;
    }

    @NotNull
    public int getQuantity() {
        return quantity;
    }

    @NotNull
    public BigDecimal getValue() {
        return value;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Invoice getInvoice() {
        return invoice;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setProduct(Product product) {
        this.product = product;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }

    private void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void addInvoiceAndProduct() {
        invoice.getItems().add(this);
        product.getItems().add(this);
    }
}
