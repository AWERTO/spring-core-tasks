package com.mazuryk.spring.core.javaconfig.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {

    @Bean
    public Product product(){
        Product product = new Product();
        product.setProductId("Intel");
        product.setProductDesc("Core i5");
        return product;
    }

    @Bean
    public Address address(){
        return new Address("Unit 69", "Metalistov");
    }
}
