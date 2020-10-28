package day15;

/**
 * Author wangyi
 * Create 2020-10-12 23:26
 * ClassName Test1
 * Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        //不指定线程名称
        // Thread t0=new Thread(new TestRunnable());
        //指定线程名称
        Thread t0 = new Thread(new TestRunnable(), "t-1");
        t0.start();
        Thread t1 = new Thread(new TestRunnable(), "t-2");
        t1.start();
        System.out.println("------------1");
        System.out.println("------------2");
        System.out.println("------------3");
    }
}
