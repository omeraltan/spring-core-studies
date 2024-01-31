package com.spring.studies.config.annobased;

public class Engine {

    private String type;
    private int amount;

    public Engine(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Engine{" +
            "type='" + type + '\'' +
            ", amount=" + amount +
            '}';
    }
}
