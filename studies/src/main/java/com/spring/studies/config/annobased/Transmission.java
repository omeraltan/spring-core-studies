package com.spring.studies.config.annobased;

public class Transmission {
    private String transType;

    public Transmission(String transType) {
        this.transType = transType;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    @Override
    public String toString() {
        return "Transmission{" +
            "transType='" + transType + '\'' +
            '}';
    }
}
