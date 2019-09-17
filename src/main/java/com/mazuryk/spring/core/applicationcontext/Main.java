package com.mazuryk.spring.core.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //loading via classpath
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("apllicationContext-album.xml");
        //loading via filesystem
        ApplicationContext applicationContext2 = new FileSystemXmlApplicationContext("file:///C:/Users/User/IdeaProjects/spring-core-tasks/src/main/resources/applicationContext-song.xml");
        System.out.println(applicationContext1.getBean(Song.class));
        System.out.println(applicationContext2.getBean(Album.class));
    }
}
