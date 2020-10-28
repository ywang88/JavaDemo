package day04.Bean;

/**
 * Author wangyi
 * Create 2020-09-16 22:51
 * ClassName Oneday8
 * Version 1.0
 */
public class Oneday8 {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("张三");
        person.setAge(20);
        person.setSex(1);
        person.showInfo();
        System.out.println(person.getSex());
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}
