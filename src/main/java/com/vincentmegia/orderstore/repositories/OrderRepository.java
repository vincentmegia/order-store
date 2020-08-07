package com.vincentmegia.orderstore.repositories;

import com.vincentmegia.orderstore.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> test1();
    List<Order> test2();
    List<Order> test3();
}
