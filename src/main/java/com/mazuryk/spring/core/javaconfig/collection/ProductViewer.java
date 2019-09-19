package com.mazuryk.spring.core.javaconfig.collection;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductViewer {

    @Autowired
    private List<Product> products; // also we can use set, map, Product[],


    public void viewProducts(){
        for (Product product : products){
            System.out.println(product);
        }
    }
}
