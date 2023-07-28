package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "plcid")
    @JsonIgnore
    private PLC plc;

    // Constructors, getters, setters, and other methods

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PLC getPlc() {
        return plc;
    }

    public void setPlc(PLC plc) {
        this.plc = plc;
    }

    // Default constructor
    public Address() {
    }

    // Constructor without PLC
    public Address(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Constructor with all fields
    public Address(Integer id, String name, String description, PLC plc) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.plc = plc;
    }

    // Getters and setters, other methods
}
