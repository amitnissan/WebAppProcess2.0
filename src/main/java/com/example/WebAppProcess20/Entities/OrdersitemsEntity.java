package com.example.WebAppProcess20.Entities;

/*
 * Created by Amit Nissan on 27/7/2018
 */

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ordersitems", schema = "theprocess", catalog = "")
@IdClass(OrdersitemsEntityPK.class)
public class OrdersitemsEntity {
    private String productId;
    private String orderId;
    private Integer qunatity;

    @Id
    @Column(name = "product_id")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Id
    @Column(name = "orderId")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "qunatity")
    public Integer getQunatity() {
        return qunatity;
    }

    public void setQunatity(Integer qunatity) {
        this.qunatity = qunatity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersitemsEntity that = (OrdersitemsEntity) o;
        return Objects.equals(productId, that.productId) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(qunatity, that.qunatity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productId, orderId, qunatity);
    }
}
