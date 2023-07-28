package com.example.demo.Entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "plc")
public class PLC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "plc_name")
    private String name;

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Column(name = "plc_token")
    private String token;

    @Column(name = "plc_userid")
    private Integer userid;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plc")
    private List<Address> addresses;

    // Constructors, getters, setters, and other methods

    // Default constructor
    public PLC() {
    }

    // Constructor without addresses
    public PLC(Integer id, String name, String token, Integer userid) {
        this.id = id;
        this.name = name;
        this.token = token;
        this.userid = userid;
    }

    // Constructor with all fields
    public PLC(Integer id, String name, String token, Integer userid, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.token = token;
        this.userid = userid;
        this.addresses = addresses;
    }

    // Getters and setters, other methods
}
