package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.PLC;

public interface PLCRepository extends JpaRepository<PLC, Integer> {
    // Custom queries can be added here if needed
    @Query("SELECT p FROM PLC p WHERE p.token = ?1")
    PLC findByToken(String token);
}
