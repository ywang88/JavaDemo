package com.mc.spring5.FactBean;

import com.mc.spring5.CollectionType.Courese;
import org.springframework.beans.factory.FactoryBean;

/**
 * Author wangyi
 * Create 2020-10-15 23:52
 * ClassName MyBean
 * Version 1.0
 */
public class MyBean implements FactoryBean<Courese> {
    @Override
    public Courese getObject() throws Exception {
        Courese courese = new Courese();
        courese.setCouresename("我是factoryBean反射的对象");
        return courese;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
