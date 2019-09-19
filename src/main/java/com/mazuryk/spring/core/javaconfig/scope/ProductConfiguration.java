package com.mazuryk.spring.core.javaconfig.scope;


import com.mazuryk.spring.core.javaconfig.collection.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mazuryk.spring.core.javaconfig.scope")
public class ProductConfiguration {

    @Bean
    public Product notebook(){
        return new Product("1","Notebook");
    }

    @Bean
    public Product mobile(){
        return new Product("2","Mobile");
    }

    //@Bean
    public Cart shoppingCart(){
        return new Cart();
    }

}
