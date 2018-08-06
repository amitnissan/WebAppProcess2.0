package com.example.WebAppProcess20.Entities;

/*
 * Created by Amit Nissan on 6/8/2018
 */

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CartEntityPK implements Serializable {
    private String cartId;
    private String clientId;
    private String productId;

    @Column(name = "cart_id")
    @Id
    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    @Column(name = "client_id")
    @Id
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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
        CartEntityPK that = (CartEntityPK) o;
        return Objects.equals(cartId, that.cartId) &&
                Objects.equals(clientId, that.clientId) &&
                Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cartId, clientId, productId);
    }
}
