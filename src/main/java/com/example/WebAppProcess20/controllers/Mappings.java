package com.example.WebAppProcess20.controllers;

/*
 * Created by Amit Nissan on 29/7/2018
 */

import com.example.WebAppProcess20.Entities.ClientsEntity;
import com.example.WebAppProcess20.Entities.ProductsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class Mappings {

    @RequestMapping("/login")
    public String login(UserSignup user) {
        return "login";
    }

    @RequestMapping("/signup")
    public String signup(UserSignup user){
        return "signup";
    }
    @RequestMapping("/signup1")
    public String signup1(UserSignup user){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Session session_for_db = factory.openSession();
        ClientsEntity client = new ClientsEntity();
        try{
            ArrayList<ClientsEntity> clients = (ArrayList<ClientsEntity>) session_for_db.createQuery("from ClientsEntity ").list();
            client.setClientId(String.valueOf(Integer.parseInt(clients.get(clients.size() - 1).getClientId()) + 1));
        }catch(NullPointerException e){
            client.setClientId("1");
        }
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

    @RequestMapping("/results")
    public ModelAndView results(UserSearch search){
        ModelAndView mav = new ModelAndView("results");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        ArrayList<ProductsEntity> li = (ArrayList<ProductsEntity>)session.createQuery("from ProductsEntity").list();
        ArrayList<ProductsEntity> res = new ArrayList<ProductsEntity>();
        for (ProductsEntity c: li) {
            if (c.getProductName().toLowerCase().contains(search.getSearch().toLowerCase())){
                res.add(c);
            }
        }
        mav.addObject("results",res);
        session.close();
        factory.close();
        return mav;
    }


    @RequestMapping("/cart")
    public String cart (Model model){
        return "cart";
    }
    @RequestMapping("/search1")
    public String search1 (Model model){
        return "search1";
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

    @RequestMapping("/about")
    public String about(Model model){
        return "about";
    }
    @RequestMapping("/contact")
    public String contact(Model model){
        return "contact";
    }
}
