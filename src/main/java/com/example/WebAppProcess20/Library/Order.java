package com.example.WebAppProcess20.Library;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderID;
    private int clientID;
    private int totalSum;

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

    private String orderStatus;
    private String notesFromClient;
    private Date orderDate;
}
