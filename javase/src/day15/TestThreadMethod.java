package day15;

/**
 * Author wangyi
 * Create 2020-10-13 21:38
 * ClassName TestThreadMethod
 * Version 1.0
 */
public class TestThreadMethod {
    public static void main(String[] args) {
        //实例化对象
        testo testo = new testo();
        testo testo1 = new testo();

        //创建多线程实例
        Thread thread = new Thread(testo);
        Thread thread1 = new Thread(testo1);

        //开始运行多线程
        thread.start();
        thread1.start();
        //设置线程优先级
        thread.setPriority(10);
        //设置线程名称
        thread.setName("t-0");
        thread1.setName("t-1");
        //如果在创建线程是美哟指定名称，系统会给出默认的名称，通过getName()获取
        System.out.println(thread.getName());
        System.out.println(thread1.getName());
      
       /*  线程的优先级，就是哪个线程有较大的概率被执行，
         优先级是用数字1-10表示，数字越大优先级越高，
         如果没有设置优先级默认为5*/

        //获取线程优先级
        System.out.println("线程一的优先级是:" + thread.getPriority());
        System.out.println("----------------------1");

        System.out.println("----------------------2");
        //判断当前线程是否存活
        System.out.println(thread1.getName() + "是否存活" + thread1.isAlive());
        //强制停止某个线程
        thread1.stop();

        try {
            //加入某个
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("----------------------3");
        //判断当前线程是否存活
        System.out.println(thread1.getName() + "是否存活" + thread1.isAlive());
    }

}

class testo implements Runnable {

    int count = 0;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":Runnable实现的多线程");
        for (int i = 0; i < 5; i++) {
//            if (i % 2 == 0) {
//                //线程让步
//                Thread.yield();
//            }

//            try {
//                //线程每个1秒执行一次
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            count++;
            System.out.println(Thread.currentThread().getName() + ":Runnable多线程程序逻辑" + count);
        }
    }
}
