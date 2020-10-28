package com.mc.spring5.BeanLife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Author wangyi
 * Create 2020-10-20 21:25
 * ClassName Orders
 * Version 1.0
 */
public class Orders {

    public Orders() {
        System.out.println("第一步，调用无参构造");
    }

    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步，调用set方法");
    }

    public void init_method() {
        System.out.println("第三步，调用初始化方法" + oname);
    }

    public void destroy_method() {
        System.out.println("第五步，执行销毁方法");
    }
}


