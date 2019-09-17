package com.mazuryk.spring.core.circular.dependency;

public class Employee {
    private Department department;

    public Employee(Department department){
        this.department = department;
    }
}
