package day04.EncapsulationHidden;

/**
 * 封装与隐藏
 * 1、先把属性设置为私有的，用private关键字
 * 2、通过编写public类型的setXXX()和getXXX()方法来设置属性和获取属性
 * Author wangyi
 * Create 2020-09-08 22:25
 * ClassName Person
 * Version 1.0
 */
public class Person {
    private int age;

    public void printage() {
        System.out.println("年龄是:" + age);
    }

    public void setAge(int a) {
        if (a <= 100 && a >= 0) {
            //隐藏属性
            age = a;
        } else {
            System.out.println("输入的年龄:" + a + "不在0到100之间");
        }
    }

    public int getAge() {
        return age;
    }
}