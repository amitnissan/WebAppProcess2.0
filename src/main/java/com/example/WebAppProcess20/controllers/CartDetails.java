package com.example.WebAppProcess20.controllers;

/*
 * Created by Amit Nissan on 9/8/2018
 */

public class CartDetails {
    private String user;
    private String product;

    public CartDetails(String user, String product) {
        this.user = user;
        this.product = product;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
