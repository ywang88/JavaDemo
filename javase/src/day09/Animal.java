package day09;

/**
 * Author wangyi
 * Create 2020-09-17 22:43
 * ClassName Animal
 * Version 1.0
 */
public abstract class Animal {
    public abstract void move();

    class Dog extends Animal {
        @Override
        public void move() {
            System.out.println("狗的移动方式是怕跑");
        }
    }

    class Fish extends Animal {
        @Override
        public void move() {
            System.out.println("鱼的行动方式是游");
        }
    }

    class Brid extends Animal {
        @Override
        public void move() {
            System.out.println("鸟的行动方式是飞");
        }
    }
}
