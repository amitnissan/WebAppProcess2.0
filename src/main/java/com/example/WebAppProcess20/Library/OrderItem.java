package com.example.WebAppProcess20.Library;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class OrderItem {

    @Id
    private int orderId;
    private int productId;
    private int quantity;
    @Override
    public String toString() {
        return "OrderItem{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                '}';
    }

    public OrderItem() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderItem(int orderId, int productId, int quantity) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }



}
