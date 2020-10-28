package com.mc.spring5.TestDemo;

import com.mc.spring5.AopNote.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author wangyi
 * Create 2020-10-21 23:10
 * ClassName TestAOP
 * Version 1.0
 */
public class TestAOP {
    @Test
    public void aopUser(){
        ApplicationContext context=new
                ClassPathXmlApplicationContext("AopNote.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
