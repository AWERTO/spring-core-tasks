package com.mazuryk.spring.core.javaconfig.scope;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Scope("prototype")
@Component
public class Cart {

    private List<Product> productList = new ArrayList<Product>();

    public void addProduct(Product product){
        productList.add(product);
    }

    public List<Product> getProducts(){
        return productList;
    }
}
