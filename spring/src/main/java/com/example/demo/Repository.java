package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
 
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Bilet9, Integer> {

    List<Bilet10> findAllByCostGreaterThan(Double cost);
}
