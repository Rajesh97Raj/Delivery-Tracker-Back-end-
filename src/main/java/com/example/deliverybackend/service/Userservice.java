package com.example.deliverybackend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.deliverybackend.entity.Userentity;
import com.example.deliverybackend.repository.Userrepository;

@Service
public class Userservice {

    @Autowired
    private Userrepository userrepository;



    public Userentity registerUser(Userentity user) {

        Optional<Userentity> existingUser =
                userrepository.findByEmail(user.getEmail());

        if(existingUser.isPresent()) {

            throw new RuntimeException(
                    "Email Already Exists");

        }



        if("ADMIN".equalsIgnoreCase(user.getRole())) {

            throw new RuntimeException(
                    "Admin Registration Not Allowed");

        }



        return userrepository.save(user);

    }



    public Userentity loginUser(String email, String password) {

        Optional<Userentity> user =
                userrepository.findByEmail(email);

        if(user.isPresent()) {

            Userentity existingUser = user.get();

            if(existingUser.getPassword().equals(password)) {

                return existingUser;

            }

        }

        return null;

    }

}