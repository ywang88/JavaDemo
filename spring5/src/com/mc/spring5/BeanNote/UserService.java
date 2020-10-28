package com.mc.spring5.BeanNote;

import org.springframework.stereotype.Component;

/**
 * Author wangyi
 * Create 2020-10-20 22:55
 * ClassName UserService
 * Version 1.0
 */
//在注解里面value属性可以省略不写，默认值是类名称，首字母小写
@Component(value = "userService") //相当于<bean id=" class=""/>
public class UserService {
    public void add(){
        System.out.println("---------------");
    }
}
