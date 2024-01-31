package com.spring.studies.ioc.field;

public class Bmw {

    private String model;
    private String color;
    private int door;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "Bmw{" +
            "model='" + model + '\'' +
            ", color='" + color + '\'' +
            ", door=" + door +
            '}';
    }
}
