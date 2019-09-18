package com.mazuryk.spring.core.autowire.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-autowire-byconstructor.xml");
        System.out.println(applicationContext.getBean(University.class));
    }
}
