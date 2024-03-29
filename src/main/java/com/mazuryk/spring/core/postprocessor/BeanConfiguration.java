package com.mazuryk.spring.core.postprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mazuryk.spring.core.postprocessor")
public class BeanConfiguration {

    @Bean(name = "Create")
    public Action action1(){
        return new Action("1","Create");
    }

    @Bean(name = "Update")
    public Action action2(){
        return new Action("2","Update");
    }
}
