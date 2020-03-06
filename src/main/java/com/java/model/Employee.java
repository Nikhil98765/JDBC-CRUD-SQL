package com.java.model;

public class Employee {
    int id;
    String name;
    String city;
    int age;
    String deptName;

    public Employee(int id, String name, String city, int age, String deptName) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
        this.deptName = deptName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public String getDeptName() {
        return deptName;
    }
}
