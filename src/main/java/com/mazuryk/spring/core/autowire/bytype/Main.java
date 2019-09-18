package com.mazuryk.spring.core.autowire.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-autowire-bytype.xml");
        System.out.println(applicationContext.getBean(Musical_school.class));
    }
}
