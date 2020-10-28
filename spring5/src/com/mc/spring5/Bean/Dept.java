package com.mc.spring5.Bean;

/**
 * Author wangyi
 * Create 2020-10-15 22:45
 * ClassName Dept
 * Version 1.0
 * 部门类
 */
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
