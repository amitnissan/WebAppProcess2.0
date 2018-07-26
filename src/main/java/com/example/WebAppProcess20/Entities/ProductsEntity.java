package com.example.WebAppProcess20.Entities;

/*
 * Created by Amit Nissan on 27/7/2018
 */

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "products", schema = "theprocess", catalog = "")
public class ProductsEntity {
    private String productId;
    private Integer availableInStock;
    private String brand;
    private String image;
    private Integer price;
    private String productCategoryTree;
    private String productName;
    private Integer rating;

    @Id
    @Column(name = "product_id")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "available_in_stock")
    public Integer getAvailableInStock() {
        return availableInStock;
    }

    public void setAvailableInStock(Integer availableInStock) {
        this.availableInStock = availableInStock;
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
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
    @Column(name = "product_category_tree")
    public String getProductCategoryTree() {
        return productCategoryTree;
    }

    public void setProductCategoryTree(String productCategoryTree) {
        this.productCategoryTree = productCategoryTree;
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
    @Column(name = "rating")
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsEntity that = (ProductsEntity) o;
        return Objects.equals(productId, that.productId) &&
                Objects.equals(availableInStock, that.availableInStock) &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(image, that.image) &&
                Objects.equals(price, that.price) &&
                Objects.equals(productCategoryTree, that.productCategoryTree) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(rating, that.rating);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productId, availableInStock, brand, image, price, productCategoryTree, productName, rating);
    }
}
