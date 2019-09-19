package com.mazuryk.spring.core.javaconfig.autowire.base.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

    @Autowired
    @Qualifier("bike")
    //or you can use annotation @Qualifier and choose a right function (use a function name in VehicleConfiguration.java file)
    private Vehicle vehicle;

    public void driveVehicle(){
        vehicle.drive();
    }
}
