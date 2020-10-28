package day09;

import javax.sound.midi.Soundbank;

/**
 * 内部类
 * Author wangyi
 * Create 2020-09-21 22:20
 * ClassName interior
 * Version 1.0
 */
public class interior {
    public int age;
    public String name;
    private int sex;

    class A {
        int like;

        public void setInterior() {
            interior.this.age = 1;
            interior.this.name = "张三";
            interior.this.sex = 2;
            this.like = 2;
        }
    }

    public void setshowInfo() {
        new A().setInterior();
    }

    public void showInfo() {
        System.out.println(this.sex);
        System.out.println(this.name);
        System.out.println(this.age);

    }

    public static void main(String[] args) {
        interior interior = new interior();
        interior.setshowInfo();
        interior.showInfo();
    }
}
