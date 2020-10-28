package day14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * proxy代理类
 * Author wangyi
 * Create 2020-10-12 22:06
 * ClassName ProxyDemo
 * Version 1.0
 */
public class ProxyDemo implements InvocationHandler {

    Object obj;//被代理的对象

    //赋值用的构造器
    public ProxyDemo(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "方法开始执行");
        //执行的是指定代理对象的指定方法
        Object result = method.invoke(this.obj, args);
        System.out.println(method.getName() + "方法执行完毕");
        return result;
    }
}
