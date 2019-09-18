package com.mazuryk.spring.core.autowire.no;

public class Human {
    private String name;
    private String username;
    private Communication communication;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Communication getCommunication() {
        return communication;
    }

    public void setCommunication(Communication communication) {
        this.communication = communication;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", communication=" + communication +
                '}';
    }
}
