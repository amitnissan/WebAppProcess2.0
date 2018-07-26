package com.example.WebAppProcess20.Entities;

/*
 * Created by Amit Nissan on 27/7/2018
 */

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "orders", schema = "theprocess", catalog = "")
public class OrdersEntity {
    private String orderId;
    private String notesFromClient;
    private Timestamp orderDate;
    private String orderStatus;
    private String clientId;
    private String totalSum;

    @Id
    @Column(name = "orderId")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "notes_from_client")
    public String getNotesFromClient() {
        return notesFromClient;
    }

    public void setNotesFromClient(String notesFromClient) {
        this.notesFromClient = notesFromClient;
    }

    @Basic
    @Column(name = "order_date")
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "order_status")
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "client_id")
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "total_sum")
    public String getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(String totalSum) {
        this.totalSum = totalSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return Objects.equals(orderId, that.orderId) &&
                Objects.equals(notesFromClient, that.notesFromClient) &&
                Objects.equals(orderDate, that.orderDate) &&
                Objects.equals(orderStatus, that.orderStatus) &&
                Objects.equals(clientId, that.clientId) &&
                Objects.equals(totalSum, that.totalSum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(orderId, notesFromClient, orderDate, orderStatus, clientId, totalSum);
    }
}
