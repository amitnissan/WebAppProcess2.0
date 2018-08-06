package com.example.WebAppProcess20.Entities;

/*
 * Created by Amit Nissan on 6/8/2018
 */

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cart", schema = "theprocess", catalog = "")
@IdClass(CartEntityPK.class)
public class CartEntity {
    private String cartId;
    private String clientId;
    private String productId;

    @Id
    @Column(name = "cart_id")
    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    @Id
    @Column(name = "client_id")
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Id
    @Column(name = "product_id")
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
        CartEntity that = (CartEntity) o;
        return Objects.equals(cartId, that.cartId) &&
                Objects.equals(clientId, that.clientId) &&
                Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cartId, clientId, productId);
    }
}
