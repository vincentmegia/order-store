package com.vincentmegia.orderstore.controllers;

import com.vincentmegia.orderstore.configurations.SpringConfiguration;
import com.vincentmegia.orderstore.models.Order;
import com.vincentmegia.orderstore.repositories.OrderRepository;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RequestMapping("order")
@RestController
public class OrderController {
    private OrderRepository orderRepository;
    private SpringConfiguration springConfiguration;

    public OrderController(OrderRepository orderRepository,
                           SpringConfiguration springConfiguration) {
        this.orderRepository = orderRepository;
        this.springConfiguration = springConfiguration;
    }

    @GetMapping(value = "/{id}", produces = { "application/hal+json" })
    public CollectionModel<Order> get(@PathVariable int id) {
        Order order = this.orderRepository.findById(id).get();
        Link link = linkTo(methodOn(OrderController.class)
                .get(id))
                .withSelfRel();
        return new CollectionModel<Order>(Arrays.asList(order), link);
    }

    @PostMapping
    public void add(@RequestBody Order order) {
        try {
            this.orderRepository.saveAndFlush(order);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @GetMapping("/test")
    public String getTest() {
        return this.springConfiguration.getTest();
    }

    public String test1() {
        return "1";
    }

    public String test2() {
        return "2";
    }

    public String test3() {
        return "3";
    }

    public String test4() {
        return "4";
    }
}
