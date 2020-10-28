package day05;

/**
 * Author wangyi
 * Create 2020-09-16 23:00
 * ClassName Person
 * Version 1.0
 */
public class Person {
    int age;
    int sex;
    String name;

    public void showInfo() {
        System.out.println("以下是Person类的showInfo()方法");
        System.out.println(this.sex);
        System.out.println(this.age);
        System.out.println(this.name);
    }

    public void showsex() {
        if (sex == 0) {
            System.out.println("男生");
        } else if (sex == 1) {
            System.out.println("女生");
        } else {
            System.out.println("不是男生也不是女生");
        }

    }

    public void showage() {
        if (age <= 0 || age <= 30) {
            System.out.println("是年轻人");
        } else if (age <= 31 || age <= 100) {
            System.out.println("是老年人");
        } else {
            System.out.println("是神仙");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
