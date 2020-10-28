package day15;

/**
 * 生产者与消费者
 * Author wangyi
 * Create 2020-10-13 23:48
 * ClassName TestProOrCli
 * Version 1.0
 */
public class TestProOrCli {
    public static void main(String[] args) {
        Clerk c = new Clerk();
        //生产者,消费时不生产，生产时不消费
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (c) {
                    while (true) {//无限生产
                        //产品为0开始生产
                        if (c.productNum == 0) {
                            System.out.println("产品数为：" + c.productNum + "开始生产");
                            while (c.productNum < 4) {
                                c.productNum++;
                                System.out.println("库存:" + c.productNum);
                            }
                            System.out.println("产品数为" + c.productNum + ",结束生产");
                            c.notify();//唤醒消费者
                        } else {
                            try {
                                c.wait();//生产者等待
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }, "c").start();


        //消费者,消费时不生产，生产时不消费
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (c) {
                    while (true) {//无限消费
                        //产品为4开始消费
                        if (c.productNum == 4) {
                            System.out.println("产品数为：" + c.productNum + "开始消费");
                            while (c.productNum > 0) {
                                c.productNum--;
                                System.out.println("库存:" + c.productNum);
                            }
                            System.out.println("产品数为" + c.productNum + ",结束消费");
                            c.notify();//唤醒生产者
                        } else {
                            try {
                                c.wait();//消费者等待
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }, "c").start();
    }
}

class Clerk {
    public static int productNum = 0;
}

