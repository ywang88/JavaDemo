package com.mc.spring5;

/**
 * Author wangyi
 * Create 2020-10-15 22:03
 * ClassName Book
 * Version 1.0
 */
public class Book {

    private String bname;
    private String bauth;
    private String byers;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauth(String bauth) {
        this.bauth = bauth;
    }

    public void setByers(String byers) {
        this.byers = byers;
    }

    public void showInfo() {
        System.out.println("书名是:" + bname + "-作者-" + bauth + "书写年份--" + byers);
    }
}
