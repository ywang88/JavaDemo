package day13;

import java.io.Serializable;

/**
 * 可序列化与反序列化的对象
 * Author wangyi
 * Create 2020-09-29 23:10
 * ClassName Person
 * Version 1.0
 */
public class Person implements Serializable {
    /* 一个用来表示序列化版本标识符的静态变量
     用来表明类的不同版本间的兼容性*/
    public static final long serialVersionUID = 1L;
    public String name;
    public int age;
}
