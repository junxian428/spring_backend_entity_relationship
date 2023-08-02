package com.example.demo.Entity;

import java.util.List;

public class Telegram {
    
    private String token;
    private Integer userid;
    private List<AddressEntry> address_name;

    // Getters
    public String getToken() {
        return token;
    }

    public Integer getUserid() {
        return userid;
    }

    public List<AddressEntry> getAddress_name() {
        return address_name;
    }

    // Setters
    public void setToken(String token) {
        this.token = token;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public void setAddress_name(List<AddressEntry> address_name) {
        this.address_name = address_name;
    }

}
