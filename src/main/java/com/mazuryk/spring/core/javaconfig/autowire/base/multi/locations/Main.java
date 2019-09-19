package com.mazuryk.spring.core.javaconfig.autowire.base.multi.locations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //we can usually import configuration file into applicationContext value, but in this example
        //we will use annotation @Import in ArtistConfiguration to import another files
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ArtistConfiguration.class);
        System.out.println(applicationContext.getBean(Artist.class));

    }
}
