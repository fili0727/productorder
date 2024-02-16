package org.example.productorderexercise.controller;

import org.example.productorderexercise.models.OrderLine;
import org.example.productorderexercise.repository.OrderLineRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderlines")
public class OrderLineController {

    private OrderLineRepository orderLineRepository;

    public OrderLineController(OrderLineRepository orderLineRepository){
        this.orderLineRepository = orderLineRepository;
    }

    @GetMapping
    public List<OrderLine> getAll(){
        return orderLineRepository.findAll();
    }

    @PostMapping
    public OrderLine createOrderLine(@RequestBody OrderLine orderLine){
        return orderLineRepository.save(orderLine);
    }
}
