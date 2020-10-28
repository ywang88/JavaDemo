package day15;

/**
 * 通过实现Runnable接口实现多线程
 * Author wangyi
 * Create 2020-10-12 23:20
 * ClassName TestRunnable
 * Version 1.0
 */
public class TestRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Runnable多线程运行的代码");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "这是Runnable多线程的逻辑代码" + i);
        }
    }
}
