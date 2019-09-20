package com.mazuryk.spring.core.profile;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //we used a vm options -Dspring.profiles.active=Dev to use active profile as Developer
        applicationContext.getEnvironment().setDefaultProfiles("Test");
        //applicationContext.getEnvironment().setDefaultProfiles("Dev");
        applicationContext.scan("com.mazuryk.spring.core.profile");
        applicationContext.refresh();
        applicationContext.getBean("databaseConfigurationHandler", DatabaseConfigurationHandler.class).print();
    }
}
