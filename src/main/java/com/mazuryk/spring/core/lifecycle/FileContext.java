package com.mazuryk.spring.core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class FileContext {
    //Another things to have this property have done is use a @PostConstruct
    @PostConstruct
    public void init(){
        System.out.println("File handler is initialized");
    }

    //And here we need to use a @PreDestroy
    @PreDestroy
    public void destroy(){
        System.out.println("File handler is closed");
    }

    public void readFile(){
        System.out.println("File content is read.");
    }
}
