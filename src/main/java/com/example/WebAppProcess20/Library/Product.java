package com.example.WebAppProcess20.Library;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int productId;
    private String productName;
    private String productCategoryTree;
    private int price;
    private String productDescription;
    private int productRating;
    private String productBrand;
    private String productSpecifications;
    private int productStock;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCategoryTree='" + productCategoryTree + '\'' +
                ", price=" + price +
                ", prodctDiscription='" + productDescription + '\'' +
                ", productRating=" + productRating +
                ", productBrand='" + productBrand + '\'' +
                ", productSpecifications='" + productSpecifications + '\'' +
                ", productStock=" + productStock +
                '}';
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategoryTree() {
        return productCategoryTree;
    }

    public void setProductCategoryTree(String productCategoryTree) {
        this.productCategoryTree = productCategoryTree;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getproductDescription() {
        return productDescription;
    }

    public void setProdctDiscription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductRating() {
        return productRating;
    }

    public void setProductRating(int productRating) {
        this.productRating = productRating;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductSpecifications() {
        return productSpecifications;
    }

    public void setProductSpecifications(String productSpecifications) {
        this.productSpecifications = productSpecifications;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public Product(int productId, String productName, String productCategoryTree, int price, String productDescription, int productRating, String productBrand, String productSpecifications, int productStock) {
        this.productId = productId;
        this.productName = productName;
        this.productCategoryTree = productCategoryTree;
        this.price = price;
        this.productDescription = productDescription;
        this.productRating = productRating;
        this.productBrand = productBrand;
        this.productSpecifications = productSpecifications;
        this.productStock = productStock;
    }

    public Product() {

    }
}
