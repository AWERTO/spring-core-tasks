package com.mazuryk.spring.core.circular.dependency;

public class Department {
    private Employee employee;

    public Department(Employee employee){
        this.employee = employee;
    }
}
