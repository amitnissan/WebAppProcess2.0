package com.example.WebAppProcess20.Entities;

/*
 * Created by Amit Nissan on 27/7/2018
 */

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class OrdersitemsEntityPK implements Serializable {
    private String productId;
    private String orderId;

    @Column(name = "product_id")
    @Id
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Column(name = "orderId")
    @Id
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersitemsEntityPK that = (OrdersitemsEntityPK) o;
        return Objects.equals(productId, that.productId) &&
                Objects.equals(orderId, that.orderId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productId, orderId);
    }
}
