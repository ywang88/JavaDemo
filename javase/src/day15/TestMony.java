package day15;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * Author wangyi
 * Create 2020-10-13 22:46
 * ClassName TestMony
 * Version 1.0
 */
public class TestMony {
    public static void main(String[] args) {
        //定义账户对象
        Acount a = new Acount();
        Acount a1 = new Acount();
        //定义多线程对象
        User u_weichat = new User(a, 2000);
        User u_alipay = new User(a, 2000);

        Thread weihcat = new Thread(u_weichat, "微信");
        Thread alipay = new Thread(u_alipay, "支付宝");
        weihcat.start();
        alipay.start();
    }
}


class Acount {
    public static int money = 3000;

    /*提款，判断账户余额够不够
    多线程调用这个方法，就有问题，线程共享资源时，一个线程在执行这个方法没有完毕时
    另一个线程又开始执行这个方法
    解决思路:显然一个线程整体执行完这个方法，另一个线程再执行
    1、通过synchronized同步锁来完成
    可以直接在方法上添加synchronized关键字。
    在普通方法上加同步锁，普通方法加synchronized，锁的是整个对象，不是某个方法
    不同对象就是不同的锁，普通方法夹synchronized，线程使用不同的此方法的对象，还有共享资源的问题
    */
    public synchronized void drawing(int m) {
        String name = Thread.currentThread().getName();
        if (money < m) {
            System.out.println(name + "操作，账户余额不足" + money);

        } else {

            System.out.println(name + "操作，账户原有余额" + money);
            System.out.println(name + "操作，取款金额" + m);
            System.out.println(name + "操作，取款操作:原有金额" + money + "-" + "取款金额" + m);
            money = money - m;
            System.out.println(name + "操作，取款后余额" + money);
        }

    }

    public synchronized void drawing1(int m) {
        String name = Thread.currentThread().getName();
        if (money < m) {
            System.out.println(name + "操作，账户余额不足" + money);

        } else {

            System.out.println(name + "操作，账户原有余额" + money);
            System.out.println(name + "操作，取款金额" + m);
            System.out.println(name + "操作，取款操作:原有金额" + money + "-" + "取款金额" + m);
            money = money - m;
            System.out.println(name + "操作，取款后余额" + money);
        }


    }

    /*2、静态方法加synchronized，对于所有的对象都是使用同一个锁*/

    public static synchronized void drawing2(int m) {
        String name = Thread.currentThread().getName();
        if (money < m) {
            System.out.println(name + "操作，账户余额不足" + money);

        } else {

            System.out.println(name + "操作，账户原有余额" + money);
            System.out.println(name + "操作，取款金额" + m);
            System.out.println(name + "操作，取款操作:原有金额" + money + "-" + "取款金额" + m);
            money = money - m;
            System.out.println(name + "操作，取款后余额" + money);
        }

    }

    /*3、对代码块添加同步锁
     *代码块synchronized(this)所有当前对象的synchronized(this)同步的带啊吗都是使用同一个锁
     * */
    public void drawing3(int m) {
        synchronized (this) {
            //用this锁代码块是代表当前这个对象，如果在其他地方也有synchronized
            //的代码块使用的都是同一个同步锁
            String name = Thread.currentThread().getName();
            if (money < m) {
                System.out.println(name + "操作，账户余额不足" + money);

            } else {

                System.out.println(name + "操作，账户原有余额" + money);
                System.out.println(name + "操作，取款金额" + m);
                System.out.println(name + "操作，取款操作:原有金额" + money + "-" + "取款金额" + m);
                money = money - m;
                System.out.println(name + "操作，取款后余额" + money);
            }
        }

    }

    public void drawing4(int m) {
        synchronized (this) {
            //用this锁代码块是代表当前这个对象，如果在其他地方也有synchronized
            //的代码块使用的都是同一个同步锁
            String name = Thread.currentThread().getName();
            if (money < m) {
                System.out.println(name + "操作，账户余额不足" + money);

            } else {

                System.out.println(name + "操作，账户原有余额" + money);
                System.out.println(name + "操作，取款金额" + m);
                System.out.println(name + "操作，取款操作:原有金额" + money + "-" + "取款金额" + m);
                money = money - m;
                System.out.println(name + "操作，取款后余额" + money);
            }
        }

    }

    /*   synchronized修饰代码块，想要根据不同的对象有不同的锁
       synchronized(a)，这个小括号中传入不同的对象就是不同的锁
       */
    public void drawing5(int m, Acount a) {
        synchronized (a) {
            //用this锁代码块是代表当前这个对象，如果在其他地方也有synchronized
            //的代码块使用的都是同一个同步锁
            String name = Thread.currentThread().getName();
            //如果是微信操作，先不执行，等支付宝操作，支付宝操作完，微信在继续操作
            if (name.equals("微信")) {
                try {
                    a.wait();//当前的线程进入阻塞状态
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (money < m) {
                System.out.println(name + "操作，账户余额不足" + money);

            } else {

                System.out.println(name + "操作，账户原有余额" + money);
                System.out.println(name + "操作，取款金额" + m);
                System.out.println(name + "操作，取款操作:原有金额" + money + "-" + "取款金额" + m);
                money = money - m;
                System.out.println(name + "操作，取款后余额" + money);
            }
            if (name.equals("支付宝")) {
           //     a.notify();//唤醒当前优先级最高的线程，进入就绪状态
                a.notifyAll();//唤醒当前所有的线程，进入就绪状态
            }

        }


    }

}

class User implements Runnable {
    Acount acount;
    int money;

    public User(Acount acount, int money) {
        this.acount = acount;
        this.money = money;
    }

    @Override
    public void run() {
//        if (Thread.currentThread().getName().equals("微信")) {
//            acount.drawing(money);
//        } else {
//            acount.drawing1(money);
//        }

        //调用静态方法解决资源
        // acount.drawing3(money);

//        if (Thread.currentThread().getName().equals("微信")) {
//            acount.drawing3(money);
//        } else {
//            acount.drawing4(money);
//        }
        acount.drawing5(money, acount);
    }
}
