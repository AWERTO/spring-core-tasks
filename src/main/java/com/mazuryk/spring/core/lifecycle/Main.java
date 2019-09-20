package com.mazuryk.spring.core.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //In this example we need to use AnnotationConfigApplicationContext instead ApplicationContext
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(FileConfiguration.class);
        applicationContext.getBean(FileContext.class).readFile();
        applicationContext.close();
    }
}
