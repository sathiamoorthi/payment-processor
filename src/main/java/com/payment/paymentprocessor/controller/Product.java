package com.payment.paymentprocessor.controller;

import java.math.BigDecimal;

public class Product {

    public Product() {
    }

    public Product(String productName, BigDecimal productPrice) {

        this.productName = productName;
        this.productPrice = productPrice;
    }

    private String productName;
    private BigDecimal productPrice;
    private Integer productId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productId=" + productId +
                '}';
    }
}
