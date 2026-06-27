package com.example.deliverybackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.deliverybackend.entity.Orderentity;
import com.example.deliverybackend.service.Orderservice;

@RestController
@RequestMapping("/orders")
@CrossOrigin("*")
public class Ordercontroller {

    @Autowired
    private Orderservice orderservice;

    @PostMapping("/create")
    public Orderentity createOrder(
            @RequestBody Orderentity order) {

        return orderservice.createOrder(order);

    }

    @GetMapping("/all")
    public List<Orderentity> getAllOrders() {

        return orderservice.getAllOrders();

    }

    @GetMapping("/{id}")
    public Orderentity getOrderById(
            @PathVariable Long id) {

        return orderservice.getOrderById(id);

    }

}