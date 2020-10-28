package day14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Author wangyi
 * Create 2020-10-12 22:11
 * ClassName TestProxy
 * Version 1.0
 */
public class TestProxy {
    public static void main(String[] args) {
        ProxyI proxy = new ProxyIImpl();

      /*  注意：如果一个对象想要通过Proxy.newProxyInstance方法被代理
                那么这个对象的类一定要有相应的接口
                就像本类中的Proxy接口和实现ProxyIImpl类*/

        proxy.test();
        proxy.test1();
        System.out.println("------------------");

        /*需求：在执行test与test1方法时需要加入一些信息
                在执行方法前打印test或test1开始执行
                在执行方法后打印test或test1执行完毕
                打印的方法名要和当时调用的方法一致
          */

        InvocationHandler handler = new ProxyDemo(proxy);
       /* Proxy.newProxyInstance(ClassLoader,interfaces,h)
        参数1是代理对象的类加载器
        参数2是被代理的对象的接口
        参数3是代理对象*/
        ProxyI proxyI = (ProxyI) Proxy.newProxyInstance(handler.getClass().getClassLoader(), proxy.getClass().getInterfaces(), handler);
        proxyI.test();
        System.out.println("------------------");
        proxyI.test1();
    }
}
