package com.mazuryk.spring.core.autowire.bytype;

public class Musical_school {
    private String name;
    private String color;
    private int height;
    private int weight;
    private int members;
    private Intruments intruments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public Intruments getIntruments() {
        return intruments;
    }

    public void setIntruments(Intruments intruments) {
        this.intruments = intruments;
    }

    @Override
    public String toString() {
        return "Musical_school{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", members=" + members +
                ", intruments=" + intruments +
                '}';
    }
}
