package com.mazuryk.spring.core.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FileConfiguration {

    @Bean//we can use this property to @Bean (initMethod = "init", destroyMethod = "destroy")
    public FileContext fileContext(){
        return new FileContext();
    }
}
