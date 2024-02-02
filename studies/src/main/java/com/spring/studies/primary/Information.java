package com.spring.studies.primary;

public class Information {

    private String name;

    public Information(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Information{" +
            "name='" + name + '\'' +
            '}';
    }
}
