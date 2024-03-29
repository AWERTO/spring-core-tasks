package com.mazuryk.spring.core.xmlconfig.setter;

import com.mazuryk.spring.core.xmlconfig.setter.Artist;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArtistMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-setter.xml");
        System.out.println(applicationContext.getBean(Artist.class));
    }
}
