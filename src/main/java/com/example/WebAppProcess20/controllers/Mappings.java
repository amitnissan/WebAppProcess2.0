package com.example.WebAppProcess20.controllers;

/*
 * Created by Amit Nissan on 29/7/2018
 */

import com.example.WebAppProcess20.Entities.CartEntity;
import com.example.WebAppProcess20.Entities.ClientsEntity;
import com.example.WebAppProcess20.Entities.ProductsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
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
    public String cart (){
        return "cart";
    }
    @RequestMapping("/search1")
    public String search1 (Model model){
        return "search1";
    }

    @RequestMapping("/search")
    public String getSearch(UserD user, HttpServletResponse response) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        ArrayList<ClientsEntity> li = (ArrayList<ClientsEntity>)session.createQuery("from ClientsEntity ").list();
        for (ClientsEntity c: li) {
            if (user.getUsername().equals(c.getUserName()) && user.getPassword().equals(c.getPassword())){
                response.addCookie(new Cookie("clientidcookie",c.getClientId()));
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

    @RequestMapping("/products_log")
    public String products_log(CartDetails cart){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Session session_for_db = factory.openSession();
        CartEntity new_cart = new CartEntity();
        try{
            ArrayList<CartEntity> carts = (ArrayList<CartEntity>)session_for_db.createQuery("from CartEntity ").list();
            if (carts.size() >= 1){
                new_cart.setCartId(String.valueOf(Integer.parseInt(carts.get(carts.size() - 1).getCartId()) + 1));
            }else{
                new_cart.setCartId("1");
            }
        }catch(NullPointerException e){
            new_cart.setCartId("1");
        }
        new_cart.setClientId(cart.getUser());
        new_cart.setProductId(cart.getProduct());
        session.save(new_cart);
        session.getTransaction().commit();
        return "products_log";
    }

    @RequestMapping("/checkout")
    public ModelAndView checkout(@CookieValue("clientidcookie") String clientid){
        ModelAndView mav = new ModelAndView("checkout");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Session session_for_db = factory.openSession();

        ArrayList<CartEntity> carts = (ArrayList<CartEntity>)session.createQuery("from CartEntity ").list();
        ArrayList<ProductsEntity> products = (ArrayList<ProductsEntity>)session_for_db.createQuery("from ProductsEntity ").list();
        ArrayList<ProductsEntity> res = new ArrayList<ProductsEntity>();
        for(CartEntity c: carts){
            if (c.getClientId().equals(clientid)){
                for(ProductsEntity p: products){
                    if (p.getProductId().equals(c.getProductId())){
                        res.add(p);
                    }
                }
            }
        }
        mav.addObject("checkout",res);
        session.close();
        factory.close();
        return mav;
    }

    @RequestMapping("/order_placed")
    public String order_placed(Model model){
        return "order_placed";
    }

}
