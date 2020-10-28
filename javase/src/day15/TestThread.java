package day15;

/**
 * 通过继承Thread实现多线程
 * Author wangyi
 * Create 2020-10-12 23:00
 * ClassName TestThread
 * Version 1.0
 */
public class TestThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread中run方法");
        for (int i = 0; i < 5; i++) {
            System.out.println("这是多线程的逻辑代码" + i);
        }
    }
}
