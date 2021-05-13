package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Bilet14, Integer> {
//    Создаем поиск для имени
    Bilet14 findByName(String name);
}