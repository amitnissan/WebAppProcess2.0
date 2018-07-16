package com.example.WebAppProcess20.controllers;

/*
 * Created by Amit Nissan on 16/7/2018
 */

import com.example.WebAppProcess20.Repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping("/products")
    // Mapping web requests to products list, "direction" to the products' list
    public String getProducts(Model model){
        model.addAttribute("products",productRepository.findAll());
        return "products";
    }
}
