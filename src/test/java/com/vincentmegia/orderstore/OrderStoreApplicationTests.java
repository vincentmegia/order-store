package com.vincentmegia.orderstore;

import com.vincentmegia.orderstore.repositories.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderStoreApplicationTests {

    @Autowired
    private OrderRepository orderRepository;

    @Test
    void contextLoads() {
        var orders = orderRepository.findAll();
//        orders.get(0).getTransactions().get(0);
        System.out.println(orders);
    }

}
