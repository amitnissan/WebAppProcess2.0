package com.example.WebAppProcess20.controllers;

/*
 * Created by Amit Nissan on 29/7/2018
 */

import com.example.WebAppProcess20.Entities.ClientsEntity;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mappings {

    @RequestMapping("/login")
    public String login(UserD user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "login";
    }

    @RequestMapping("/signup")
    public String signup(UserSignup user){
        return "signup";
    }
    @RequestMapping("/signup1")
    public String signup1(UserSignup user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        ClientsEntity client = new ClientsEntity();
        client.setClientId("4");
        client.setCity(user.getCity());
        client.setClientName(user.getClientName());
        client.setCountry(user.getCountry());
        client.setDateOfBirth(user.getDateOfBirth());
        client.setEmailAddress(user.getEmailAddress());
        client.setFavouriteCategories(user.getFavouriteCategories());
        client.setGender(user.getGender());
        client.setHomeAdress(user.getHomeAdress());
        client.setPassword(user.getPassword());
        client.setUserName(user.getUserName());
        session.save(client);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
        return "signup1";
    }

    @RequestMapping("/cart")
    public String cart (Model model){
        return "cart";
    }

    @RequestMapping("/search")
    public String getSearch(Model model){
        return "search";
    }

}
