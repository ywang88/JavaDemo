package com.mc.java8.entity;

/**
 * Author wangyi
 * Create 2020-10-27 23:24
 * ClassName Employee
 * Version 1.0
 */
public class Employee {
    private String name;
    private int age;
    private double wage;

    public Employee() {
    }

    public Employee(String name, int age, double wage) {
        this.name = name;
        this.age = age;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wage=" + wage +
                '}';
    }
}
