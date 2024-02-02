package com.spring.studies.autowiringofgeneric;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Car extends Vehicle{
    private String engineType;

    @Autowired
    @CarQualifier
    private List<Vehicle> vehicles;

    public Car(String e280, String mercedes, String diesel) {
        super();
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
