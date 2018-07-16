package com.example.WebAppProcess20.controllers;

/*
 * Created by Amit Nissan on 16/7/2018
 */

import com.example.WebAppProcess20.Repositories.OrderRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
    private OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @RequestMapping("/orders")
    // Mapping web requests to orders list, "direction" to the orders' list
    public String getOrders(Model model){
        model.addAttribute("orders", orderRepository.findAll());
        return "orders";
    }
}
