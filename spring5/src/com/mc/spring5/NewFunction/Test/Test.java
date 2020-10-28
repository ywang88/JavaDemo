package com.mc.spring5.NewFunction.Test;

import com.mc.spring5.NewFunction.entity.User;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Author wangyi
 * Create 2020-10-27 21:45
 * ClassName Test
 * ClassName Test
 * Version 1.0
 */
public class Test {
    //函数式风格创建对象，交给spring进行管理
    @org.junit.Test
    public void teset() {
        //1、创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2、调用context的方法对象注册
        context.refresh();
        context.registerBean("user",User.class, () -> new User());
        //3、获取sprign注册对象
        //User user = (User) context.getBean("com.mc.spring5.NewFunction.entity.User");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
