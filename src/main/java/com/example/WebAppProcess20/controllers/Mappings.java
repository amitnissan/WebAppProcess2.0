package com.example.WebAppProcess20.controllers;

/*
 * Created by Amit Nissan on 29/7/2018
 */

import com.example.WebAppProcess20.Constants;
import com.example.WebAppProcess20.Entities.ClientsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class Mappings {

    @RequestMapping("/login")
    public String login(UserSignup user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        ClientsEntity client = new ClientsEntity();
        client.setClientId(String.valueOf(Constants.CLIENT_ID++));
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
        return "login";
    }

    @RequestMapping("/signup")
    public String signup(UserSignup user){
        return "signup";
    }
    @RequestMapping("/signup1")
    public String signup1(UserSignup user){
        return "signup1";
    }

    @RequestMapping("/cart")
    public String cart (Model model){
        return "cart";
    }

    @RequestMapping("/search")
    public String getSearch(UserD user) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        ArrayList<ClientsEntity> li = (ArrayList<ClientsEntity>)session.createQuery("from ClientsEntity ").list();
        for (ClientsEntity c: li) {
            if (user.getUsername().equals(c.getUserName()) && user.getPassword().equals(c.getPassword())){
                return "search";
            }
        }
        session.close();
        factory.close();
        return "login";
    }

}
