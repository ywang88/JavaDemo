package com.mc.spring5.CollectionType;

/**
 * Author wangyi
 * Create 2020-10-15 23:24
 * ClassName Courese
 * Version 1.0
 */
public class Courese {
    private String couresename;

    public void setCouresename(String couresename) {
        this.couresename = couresename;
    }

    @Override
    public String toString() {
        return "Courese{" +
                "couresename='" + couresename + '\'' +
                '}';
    }
}
