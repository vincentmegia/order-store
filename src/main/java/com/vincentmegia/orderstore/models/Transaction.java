package com.vincentmegia.orderstore.models;

import org.hibernate.annotations.Parent;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="orderid")
    private Order order;

    public Transaction() {}

    public long getId() { return id; }
    public double getPrice() { return price; }
    public Order getParent() { return order; }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        var o = (Transaction)obj;
        return o.id == this.id;
    }
}
