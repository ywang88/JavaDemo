package day04.This;

/**
 * 1、this指向当前类变量
 * 2、调用类中其他构造方法(调用的构造器形参必须与调用的方法中有相同数据类型)
 * this()必须放在构造器首行
 * Author wangyi
 * Create 2020-09-09 22:04
 * ClassName Person
 * Version 1.0
 */
public class Person {

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        //调用无形参的构造方法， public Person()
        this();
        this.name = name;
    }

    public Person(int age, String name) {
        //调用一个形参的构造方法，public Person(int age)
        this(3);
        this.age = age;
        this.name = name;
    }

    int age;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    //把形参的值赋给setName方法中的name
    public void setName1(String name) {
        this.setName(name);
    }
}