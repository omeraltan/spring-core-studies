package com.spring.studies.ioc.constructor;

public class OtherInformation {
    private int age;
    private long salary;
    private int birthYear;
    private String gender;

    public OtherInformation(int age, long salary, int birthYear, String gender) {
        this.age = age;
        this.salary = salary;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "OtherInformation{" +
            "age=" + age +
            ", salary=" + salary +
            ", birthYear=" + birthYear +
            ", gender='" + gender + '\'' +
            '}';
    }
}
