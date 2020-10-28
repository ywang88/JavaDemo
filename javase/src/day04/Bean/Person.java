package day04.Bean;


/**
 * 1、属性私有化,s属性对应的get,set方法
 * Author wangyi
 * Create 2020-09-09 22:27
 * ClassName Person
 * Version 1.0
 */
//一个javaBean
public class Person {
    private int age;//年龄
    private String name;//姓名
    private int sex;//性别0女1男

    public void showInfo() {

        System.out.println(name);
        System.out.println(age);
        if (sex == 0) {
            System.out.println("女");
        } else if (sex == 1) {
            System.out.println("男");
        }else {
            System.out.println("请输入0或1");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
