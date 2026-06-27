package com.example.deliverybackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.deliverybackend.entity.Orderentity;
import com.example.deliverybackend.repository.Orderrepository;

@Service
public class Orderservice {

    @Autowired
    private Orderrepository orderrepository;

    public Orderentity createOrder(Orderentity order) {

        return orderrepository.save(order);

    }

    public List<Orderentity> getAllOrders() {

        return orderrepository.findAll();

    }

    public Orderentity getOrderById(Long id) {

        return orderrepository.findById(id)
                .orElse(null);

    }

}