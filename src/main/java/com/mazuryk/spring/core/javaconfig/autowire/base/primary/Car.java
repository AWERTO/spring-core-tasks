package com.mazuryk.spring.core.javaconfig.autowire.base.primary;

public class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving car!!!");
    }
}
