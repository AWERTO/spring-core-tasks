package com.mazuryk.spring.core.javaconfig.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProductConfiguration.class);

        Cart shoppingCart1 =  applicationContext.getBean(Cart.class);
        Product notebook = applicationContext.getBean("notebook",Product.class);
        shoppingCart1.addProduct(notebook);
        System.out.println(shoppingCart1.getProducts());

        Cart shoppingCart2 = applicationContext.getBean(Cart.class);
        Product mobile = applicationContext.getBean("mobile", Product.class);
        shoppingCart2.addProduct(mobile);
        System.out.println(shoppingCart2.getProducts());
    }
}
