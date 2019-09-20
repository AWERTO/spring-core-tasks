package com.mazuryk.spring.core.factory.staticfactory;

public class DBReader implements Reader{
    public void read() {
        System.out.println("DBReader have read your file.");
    }
}
