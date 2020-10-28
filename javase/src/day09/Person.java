package day09;

import java.util.SplittableRandom;

/**
 * Author wangyi
 * Create 2020-09-16 23:18
 * ClassName Person
 * Version 1.0
 */
public class Person {
    String name;
    static int age;
    static TestPerson testPerson = new TestPerson();

    public Person() {
        this.name = "张三";
        System.out.println("执行构造方法");
    }

    {
        System.out.println("执行的非静态代码块1");
    }

    {
        System.out.println("执行的非静态代码块2");
    }

    //静态代码块,只会被执行一次
    //作用,初始化值，包括对象
    static {
        age = 2;
        showAge();
        System.out.println("==执行的静态代码块,只会被执行一次==");
        testPerson.age = 12;
        testPerson.name = "哈哈";
    }

    public static void showAge() {
        System.out.println(age);
    }

    public void test() {
        System.out.println("Person的test方法");
    }
}
