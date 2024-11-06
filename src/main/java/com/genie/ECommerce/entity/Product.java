package com.genie.ECommerce.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer productId;

    private String productName;
    private String descriptiion;
    private Double price;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "categoryId", referencedColumnName = "categoryId")
//    private Category category;

    Product() {

    }

    Product(String productName, String descriptiion, Double price, Category category) {
        this.productName = productName;
        this.descriptiion = descriptiion;
        this.price = price;
//        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescriptiion() {
        return descriptiion;
    }

    public void setDescriptiion(String descriptiion) {
        this.descriptiion = descriptiion;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }
}
