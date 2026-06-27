package com.example.deliverybackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.deliverybackend.entity.Userentity;
import com.example.deliverybackend.service.Userservice;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class Usercontroller {

    @Autowired
    private Userservice userservice;



    @PostMapping("/register")
    public Userentity registerUser(@RequestBody Userentity user) {

        return userservice.registerUser(user);

    }



    @PostMapping("/login")
    public Userentity loginUser(@RequestBody Userentity user) {

        return userservice.loginUser(user.getEmail(), user.getPassword());

    }

}


