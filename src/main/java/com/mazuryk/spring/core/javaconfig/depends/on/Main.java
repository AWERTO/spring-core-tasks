package com.mazuryk.spring.core.javaconfig.depends.on;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        applicationContext.getBean(Initialization.class).print();
    }
}
