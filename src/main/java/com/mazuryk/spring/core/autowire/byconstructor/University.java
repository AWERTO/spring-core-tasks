package com.mazuryk.spring.core.autowire.byconstructor;

public class University {
    private String name;
    private String location;
    private String level_graduating;
    private String year;
    private Member member;

    public University(String name, String location, String level_graduating, String year, Member member) {
        this.name = name;
        this.location = location;
        this.level_graduating = level_graduating;
        this.year = year;
        this.member = member;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", level_graduating='" + level_graduating + '\'' +
                ", year='" + year + '\'' +
                ", member=" + member +
                '}';
    }
}
