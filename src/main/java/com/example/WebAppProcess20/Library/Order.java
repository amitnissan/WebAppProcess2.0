package com.example.WebAppProcess20.Library;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderID;
    private int clientID;
    private int totalSum;
    private String orderStatus;
    private String notesFromClient;
    private Date orderDate;
    //TODO: Do we need to add an "invoiceID" attribute? I think so

    // TODO: check whether we need a "many to one" relation in here
    // TODO: --> I don't think so because each order has only one client
    // TODO: --> that appears as "clientID".

    @JoinTable(name = "order's products",  joinColumns = @JoinColumn(name = "orderID"),
    inverseJoinColumns = @JoinColumn(name = "productID"))
    // Creates a join table of all the products in an order by order
    private Set<Product> products = new HashSet<>();
    // TODO: I think that this list makes the class "OrderItem" useless

    public int getOrderID() {
        return orderID;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", clientID=" + clientID +
                ", totalSum=" + totalSum +
                ", orderStatus='" + orderStatus + '\'' +
                ", notesFromClient='" + notesFromClient + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getNotesFromClient() {
        return notesFromClient;
    }

    public void setNotesFromClient(String notesFromClient) {
        this.notesFromClient = notesFromClient;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Order() {

    }

    public Order(int clientID, int totalSum, String orderStatus, String notesFromClient, Date orderDate) {
        this.clientID = clientID;
        this.totalSum = totalSum;
        this.orderStatus = orderStatus;
        this.notesFromClient = notesFromClient;
        this.orderDate = orderDate;
    }

    public Order(int clientID, int totalSum, String orderStatus, String notesFromClient, Date orderDate, Set<Product> products) {
        this.clientID = clientID;
        this.totalSum = totalSum;
        this.orderStatus = orderStatus;
        this.notesFromClient = notesFromClient;
        this.orderDate = orderDate;
        this.products = products;
    }
}
