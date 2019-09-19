package com.mazuryk.spring.core.javaconfig.collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration  {

    @Bean
    public Product product1(){
        return new Product("Nvidia","GeForce GTX1080TI");
    }

    @Bean
    public Product product2(){
        return new Product("Radeon","R5520");
    }

    @Bean
    public Product product3(){
        return new Product("Supra","GTX1060");
    }

    @Bean
    public Product product4(){
        return new Product("Vetra","GT970");
    }

    @Bean
    public ProductViewer productViewer(){
        return new ProductViewer();
    }
}
