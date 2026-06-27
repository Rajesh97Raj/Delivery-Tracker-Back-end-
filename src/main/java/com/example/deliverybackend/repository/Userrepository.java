package com.example.deliverybackend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.deliverybackend.entity.Userentity;

public interface Userrepository extends JpaRepository<Userentity, Long>{

    Optional<Userentity> findByEmail(String email);

}
