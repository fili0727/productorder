package org.example.productorderexercise.controller;

import org.example.productorderexercise.models.Order;
import org.example.productorderexercise.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public List<Order> getAll(){
        return orderRepository.findAll();
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order){
        return orderRepository.save(order);
    }


}
