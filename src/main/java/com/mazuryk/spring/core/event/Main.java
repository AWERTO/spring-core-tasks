package com.mazuryk.spring.core.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MessageConfiguration.class);
        //applicationContext.getBean(MessagePublisher.class).publishMessage();
        applicationContext.start();
        //applicationContext.refresh();
        applicationContext.stop();
        applicationContext.close();
    }
}
