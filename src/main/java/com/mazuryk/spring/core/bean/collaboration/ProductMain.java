package com.mazuryk.spring.core.bean.collaboration;

import com.mazuryk.spring.core.bean.collaboration.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {
    public static void main(String[] args) {

        //1. Instantiate the Spring IoC Container (Inversion of Control)
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-beancollaboration1.xml");

        //2. Get  the bean  information from Spring IoC
        //Product product = (Product) applicationContext.getBean("product2"); // that way
        Product product = (Product) applicationContext.getBean(Product.class); // or that way
        //Product product = (Product) applicationContext.getBean(Product.class); // or another way

        //3. Use the bean
        System.out.println(product);
    }
}
