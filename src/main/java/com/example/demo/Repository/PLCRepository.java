package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.PLC;

public interface PLCRepository extends JpaRepository<PLC, Integer> {
    // Custom queries can be added here if needed
}
