package com.example.swiggy.controller;

import com.example.swiggy.entity.OrderEntity;
import com.example.swiggy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/order")
    public String order(@RequestBody OrderEntity order) {

        return service.placeOrder(order);

    }

}