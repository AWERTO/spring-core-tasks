package com.mazuryk.spring.core.autowire.bytype;

public class Intruments {
    private String type;
    private String intruments_name;
    private String intruments_color;
    private String categories;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIntruments_name() {
        return intruments_name;
    }

    public void setIntruments_name(String intruments_name) {
        this.intruments_name = intruments_name;
    }

    public String getIntruments_color() {
        return intruments_color;
    }

    public void setIntruments_color(String intruments_color) {
        this.intruments_color = intruments_color;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Intruments{" +
                "type='" + type + '\'' +
                ", intruments_name='" + intruments_name + '\'' +
                ", intruments_color='" + intruments_color + '\'' +
                ", categories='" + categories + '\'' +
                '}';
    }
}
