package com.example.WebAppProcess20.Entities;

/*
 * Created by Amit Nissan on 22/7/2018
 */

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "orders", schema = "theprocess")
public class OrdersEntity {
    private String orderId;
    private String totalSum;
    private String orderStatus;
    private String notesFromClient;
    private Timestamp orderDate;
    private ClientsEntity clientsByClientId;

    @ManyToMany
    @OnDelete(action = OnDeleteAction.CASCADE)
    // Creates a join table of all the products in an order by order
    private Set<ProductsEntity> products = new HashSet<>();

    @Id
    @Column(name = "orderId")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "totalSum")
    public String getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(String totalSum) {
        this.totalSum = totalSum;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return Objects.equals(orderId, that.orderId) &&
                Objects.equals(totalSum, that.totalSum) &&
                Objects.equals(orderStatus, that.orderStatus) &&
                Objects.equals(notesFromClient, that.notesFromClient) &&
                Objects.equals(orderDate, that.orderDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(orderId, totalSum, orderStatus, notesFromClient, orderDate);
    }

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "client_id", nullable = false)
    public ClientsEntity getClientsByClientId() {
        return clientsByClientId;
    }

    public void setClientsByClientId(ClientsEntity clientsByClientId) {
        this.clientsByClientId = clientsByClientId;
    }
}
