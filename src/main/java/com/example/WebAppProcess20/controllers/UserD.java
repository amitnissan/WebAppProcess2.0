package com.example.WebAppProcess20.controllers;

/*
 * Created by Amit Nissan on 29/7/2018
 */

public class UserD {
    private String username;
    private String password;

    public UserD(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
