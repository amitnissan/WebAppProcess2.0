package com.example.WebAppProcess20.bootstrap;

/*
 * Created by Amit Nissan on 22/7/2018
 */

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ordersitems", schema = "theprocess")
@IdClass(OrdersitemsEntityPK.class)
public class OrdersitemsEntity {
    private String orderId;
    private String productId;
    private Integer qunatity;
    private OrdersEntity ordersByOrderId;

    @Id
    @Column(name = "orderId")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Id
    @Column(name = "product_id")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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
        return Objects.equals(orderId, that.orderId) &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(qunatity, that.qunatity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(orderId, productId, qunatity);
    }

    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "orderId", nullable = false)
    public OrdersEntity getOrdersByOrderId() {
        return ordersByOrderId;
    }

    public void setOrdersByOrderId(OrdersEntity ordersByOrderId) {
        this.ordersByOrderId = ordersByOrderId;
    }
}
