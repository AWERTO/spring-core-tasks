package com.mazuryk.spring.core.factory.staticfactory;

public class SocketReader implements Reader {
    public void read() {
        System.out.println("Socket-reader have read your files.");
    }
}
