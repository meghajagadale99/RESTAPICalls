package com.bridgelabz.restapi.entity;

import lombok.Data;

@Data
public class UserEntity {
    private String fname, lname;

    public String details() {
        return "Hello " + getFname() + " " + getLname() + " from BridgeLabz!";
    }
}
