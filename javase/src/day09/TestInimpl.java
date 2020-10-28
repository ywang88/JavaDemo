package day09;

/**
 * 子类继承父类，只能继承一个父类
 * 类可以实现多个接口，多个接口用，分隔
 * 如果这个类没有全部实现接口的方法，那么该类需要设计为抽象类
 * 如果一个类即继承父类，又实现接口。那么先继承在实现
 * Author wangyi
 * Create 2020-09-17 23:27
 * ClassName TestInimpl
 * Version 1.0
 */
public class TestInimpl extends Person implements TestIn, TestIn1 {
    @Override
    public void test() {

    }

    @Override
    public void test1() {

    }
}
