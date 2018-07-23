package com.example.WebAppProcess20.Entities;

/*
 * Created by Amit Nissan on 22/7/2018
 */

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class OrdersitemsEntityPK implements Serializable {
    private String orderId;
    private String productId;

    @Column(name = "orderId")
    @Id
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Column(name = "product_id")
    @Id
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersitemsEntityPK that = (OrdersitemsEntityPK) o;
        return Objects.equals(orderId, that.orderId) &&
                Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(orderId, productId);
    }
}
