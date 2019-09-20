package com.mazuryk.spring.core.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();//We can use AwareConfiguration.class in AnnotationConfigApplicationContext


        //All this stuff is only for EnvironmentInspector class
        StandardEnvironment standardEnvironment = new StandardEnvironment();
        MutablePropertySources propertySources = standardEnvironment.getPropertySources();

        Map<String, Object> map = new HashMap<>();
        map.put("name", "Vladyslav");

        propertySources.addFirst(new MapPropertySource("custom", map));

        applicationContext.setEnvironment(standardEnvironment);

        applicationContext.scan("com.mazuryk.spring.core.aware");
        applicationContext.refresh();
    }
}
