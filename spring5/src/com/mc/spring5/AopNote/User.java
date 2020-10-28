package com.mc.spring5.AopNote;

import org.springframework.stereotype.Component;

/**
 * Author wangyi
 * Create 2020-10-21 22:52
 * ClassName User
 * Version 1.0
 */
//被增强的类'
@Component
public class User {
    public void add() {
        System.out.println("add-------------");
    }
}
