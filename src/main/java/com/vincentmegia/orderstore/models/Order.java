package com.vincentmegia.orderstore.models;

import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="orders")
public class Order extends RepresentationModel<Order>
        implements Comparable<Order> {
    @Id
    @GeneratedValue
    private int id;

    @Column(name="symbol")
    private String symbol;

    @Column(name="side")
    private String side;

    @Column(name="quantity")
    private int quantity;

    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER)
    private Set<Transaction> transactions = new HashSet<>();

    public Order() {
    }

    public void setId(int id) { this.id = id; }
    public int getId() {
        return this.id;
    }
    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }
    public String getSide() { return side; }
    public void setSide(String side) { this.side = side; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public Set<Transaction> getTransactions() { return transactions; }
    public void setTransactions(Set<Transaction> transactions) { this.transactions = transactions; }

    @Override
    public int compareTo(Order order) {
        return Comparator.comparing(Order::getId)
                .reversed()
                .thenComparing(Order::getSymbol)
                .compare(this, order);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                '}';
    }
}
