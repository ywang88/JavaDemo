package com.mc.spring5.BeanAutowire;

/**
 * Author wangyi
 * Create 2020-10-20 22:02
 * ClassName Emp
 * Version 1.0
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test() {
        System.out.println(dept);
    }
}
