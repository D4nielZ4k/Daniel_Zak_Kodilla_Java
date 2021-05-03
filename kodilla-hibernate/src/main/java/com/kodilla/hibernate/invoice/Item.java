package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


@Entity
@Table(name = "ITEM")
public class Item {

    private int id;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;

    private Invoice invoice;
    private Product product;

    public Item() {
    }

    public Item(BigDecimal price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        this.value = price.multiply(new BigDecimal(quantity));
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }


    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }


    @NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }


    @NotNull
    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }


    @NotNull
    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }


    @NotNull
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
