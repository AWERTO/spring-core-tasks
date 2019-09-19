package com.mazuryk.spring.core.javaconfig.autowire.base.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class VehicleConfiguration {

    @Bean
    //you can use @Primary annotation to avoid a conflict, where you have an error of nouniquebeandefinition
    public Vehicle bike(){
        return new Bike();
    }

    @Bean
    //or here
    public Vehicle car(){
        return new Car();
    }

    @Bean
    public Person person(){
        return new Person();
    }

}
