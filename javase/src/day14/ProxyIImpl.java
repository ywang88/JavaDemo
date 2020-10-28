package day14;

/**
 * Author wangyi
 * Create 2020-10-12 22:02
 * ClassName PoxyImpl
 * Version 1.0
 */
public class ProxyIImpl implements ProxyI {
    @Override
    public void test() {
        System.out.println("执行test()方法");
    }

    @Override
    public void test1() {
        System.out.println("执行test1()方法");
    }
}
