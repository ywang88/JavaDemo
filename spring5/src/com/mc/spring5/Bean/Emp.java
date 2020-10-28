package com.mc.spring5.Bean;

/**
 * Author wangyi
 * Create 2020-10-15 22:46
 * ClassName Emp
 * Version 1.0
 * 员工类
 */
public class Emp {
    private String ename;
    private String eender;
    //员工属于某一个部门，使用对象形式表示
    private Dept dept;

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEender(String eender) {
        this.eender = eender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void add() {
        System.out.println("姓名为:" + ename + "的人职位是:" + eender + "所在部门是" + dept);
    }
}
