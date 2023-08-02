package com.example.demo.Entity;

public class Telegram {
    

    private String token;

    private Integer userid;

    private String address_name;

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

    public String getAddress_name() {
        return address_name;
    }

    public void setAddress_name(String address_name) {
        this.address_name = address_name;
    }

    public Telegram(){
        
    }

    public Telegram(String token, Integer userid, String address_name) {
        this.token = token;
        this.userid = userid;
        this.address_name = address_name;
    }


    @Override
    public String toString() {
        return "{" +
                "token='" + token + '\'' +
                ", userid=" + userid +
                ", address_name='" + address_name + '\'' +
                '}';
    }

}
