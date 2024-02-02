package com.spring.studies.ioc.constructor;

public class Person {
    private String name;
    private String surname;
    private OtherInformation information;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, OtherInformation information) {
        this.name = name;
        this.surname = surname;
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public OtherInformation getInformation() {
        return information;
    }

    public void setInformation(OtherInformation information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", information=" + information +
            '}';
    }
}
