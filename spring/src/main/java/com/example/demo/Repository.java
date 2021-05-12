package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Bilet10, Integer> {

    List<Bilet10> findAllByCostLessThan(Double cost);
}