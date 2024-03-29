package com.mazuryk.spring.core.javaconfig.collection;

public class Product {
    private String productId;
    private String productDesc;

    public Product(String productId, String productDesc) {
        this.productId = productId;
        this.productDesc = productDesc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productDesc='" + productDesc + '\'' +
                '}';
    }
}
