package com.example.WebAppProcess20.controllers;

/*
 * Created by Amit Nissan on 16/7/2018
 */

import com.example.WebAppProcess20.Repositories.ClientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {
    private ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @RequestMapping("/login")
    public String login(UserD user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "login";
    }

    @RequestMapping("/clients")
    // Mapping web requests to clients list, "direction" to the clients' list
    public String getClients(Model model){
        model.addAttribute("clients",clientRepository.findAll());
        return "clients";
    }
}
