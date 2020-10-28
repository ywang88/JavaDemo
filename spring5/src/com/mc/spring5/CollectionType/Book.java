package com.mc.spring5.CollectionType;

import java.util.List;

/**
 * Author wangyi
 * Create 2020-10-15 23:36
 * ClassName Book
 * Version 1.0
 */
public class Book {
    private List<String> bname;

    public void setBname(List<String> bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                '}';
    }

    public void add() {
        System.out.println(bname);
    }
}
