package day09;



/**
 * 现在类A想同时获得类B和类C的方法，并且重写
 * 可以使用内部类来实现类的多重继承，可以同时继承多个类
 * Author wangyi
 * Create 2020-09-21 22:37
 * ClassName TestInterior
 * Version 1.0
 */
public class TestInterior {
    public static void main(String[] args) {
        A a=new A();
        a.testA();
        a.testB();
    }
}

class A {
    public void testB() {
        new innerB().testB();
    }

    public void testA() {
        new innerC().testA();
    }

    private class innerB extends B {
        @Override
        public void testB() {
            System.out.println("这是重写之后的testB方法");
        }
    }

    private class innerC extends C {
        @Override
        public void testA() {
            System.out.println("这是重写之后的testC方法");
        }
    }
}

class B {
    public void testB() {

    }
}

class C {
    public void testA() {

    }
}
