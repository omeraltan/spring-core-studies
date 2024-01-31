package com.spring.studies.ioc.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Cars {

    private String type;
    private int wheel;
    @Autowired
    @Qualifier(value = "bmwId2")
    // if there is more than one bean of the same type,
    // we can sue the @Qualifier annotation to reference a bean by name
    private Bmw bmw;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public Bmw getBmw() {
        return bmw;
    }

    public void setBmw(Bmw bmw) {
        this.bmw = bmw;
    }

    @Override
    public String toString() {
        return "Cars{" +
            "type='" + type + '\'' +
            ", wheel=" + wheel +
            ", bmw=" + bmw +
            '}';
    }
}
