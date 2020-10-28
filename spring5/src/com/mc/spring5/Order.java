package com.mc.spring5;

/**
 * 有参构造注入属性
 * Author wangyi
 * Create 2020-10-15 22:10
 * ClassName Order
 * Version 1.0
 */
public class Order {
    private String oname;
    private String oaddress;

    public Order(String oname, String oaddress) {
        this.oname = oname;
        this.oaddress = oaddress;
    }
    public void showInfo() {
        System.out.println("商品名称:" + oname + "-收货地址-" + oaddress);
    }
}
