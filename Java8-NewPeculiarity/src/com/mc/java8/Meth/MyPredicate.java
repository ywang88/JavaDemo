package com.mc.java8.Meth;

/**
 * Author wangyi
 * Create 2020-10-27 23:40
 * ClassName MyPredicate
 * Version 1.0
 */
//1、添加一个泛型接口
@FunctionalInterface
public interface MyPredicate<T> {
    //2、添加一个boolean返回方法
    public boolean test(T t);
}
