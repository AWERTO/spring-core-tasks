package com.mazuryk.spring.core.javaconfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArtistMain {
    public static void main(String[] args) {
        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ArtistConfiguration.class); // one way to set-up Bean
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(ArtistConfiguration.class);
        System.out.println(beanFactory.getBean("the_best_artist"));
        //System.out.println(applicationContext.getBean("the_second_artist"));
    }
}
