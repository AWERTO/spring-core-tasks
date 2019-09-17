package com.mazuryk.spring.core.bean.collaboration;

public class Product {
    private String productId;
    private String productName;
    private String productDesc;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Product(String productId, String productName, String productDesc, Address address) {
        this.productId = productId;
        this.productName = productName;
        this.productDesc = productDesc;
        this.address = address;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    @Override
    public String toString() {
        return "Product[" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", address=" + address +
                ']';
    }
}
