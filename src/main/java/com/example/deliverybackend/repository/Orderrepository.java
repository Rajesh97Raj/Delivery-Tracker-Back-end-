package com.example.deliverybackend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.deliverybackend.entity.Orderentity;

public interface Orderrepository
        extends JpaRepository<Orderentity, Long> {

    Optional<Orderentity> findById(Long id);

}
