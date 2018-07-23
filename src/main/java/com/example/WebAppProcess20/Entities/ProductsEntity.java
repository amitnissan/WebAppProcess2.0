package com.example.WebAppProcess20.Entities;

/*
 * Created by Amit Nissan on 22/7/2018
 */

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "products", schema = "theprocess")
public class ProductsEntity {
    private String productId;
    private String productName;
    private String productCategoryTree;
    private Integer price;
    private String image;
    private Integer rating;
    private String brand;
    private Integer availableInStock;

    @ManyToMany(mappedBy = "products", cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Set<OrdersEntity> orders = new HashSet<>();
    @Id
    @Column(name = "product_id")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_category_tree")
    public String getProductCategoryTree() {
        return productCategoryTree;
    }

    public void setProductCategoryTree(String productCategoryTree) {
        this.productCategoryTree = productCategoryTree;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "rating")
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "available_in_stock")
    public Integer getAvailableInStock() {
        return availableInStock;
    }

    public void setAvailableInStock(Integer availableInStock) {
        this.availableInStock = availableInStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsEntity that = (ProductsEntity) o;
        return Objects.equals(productId, that.productId) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(productCategoryTree, that.productCategoryTree) &&
                Objects.equals(price, that.price) &&
                Objects.equals(image, that.image) &&
                Objects.equals(rating, that.rating) &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(availableInStock, that.availableInStock);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productId, productName, productCategoryTree, price, image, rating, brand, availableInStock);
    }
}
