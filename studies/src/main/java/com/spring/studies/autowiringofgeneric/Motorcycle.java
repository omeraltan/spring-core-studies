package com.spring.studies.autowiringofgeneric;

public class Motorcycle extends Vehicle{
    private boolean twoWheeler;

    public boolean isTwoWheeler() {
        return twoWheeler;
    }

    public void setTwoWheeler(boolean twoWheeler) {
        this.twoWheeler = twoWheeler;
    }
}
