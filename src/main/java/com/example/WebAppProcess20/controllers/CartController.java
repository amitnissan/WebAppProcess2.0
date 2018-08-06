package com.example.WebAppProcess20.controllers;

/*
 * Created by Amit Nissan on 6/8/2018
 */

import com.example.WebAppProcess20.Repositories.CartRepository;

public class CartController {
    private CartRepository cartRepository;
    public CartController(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }
}
