package day15;

/**
 * Author wangyi
 * Create 2020-10-12 23:00
 * ClassName Test
 * Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Thread to = new TestThread();
        //开启线程
        to.start();
        System.out.println("-------------1");
        System.out.println("-------------2");
        System.out.println("-------------3");

        /*多次运行这个mn方法之后
          我们发现ma1n方法中打印的3行与开启线程运行xun方法中、
          的打印语句是混合起来，而且man方法中的打印与rn方法中
          打印语句顺是不固定的，
          为什么呢？
           main执行to.start（）方法开启多线程之后，就相当于在man
           方法之外开启一个支流,这个个时候to.start（）的之后的main
           方法的其他代码的运行就与run方法运行无关了,以当前代码为例
           to.start（）的之后的min方法的其他代码与run方法的代码并行
           运行像两条河流一样，个走各的，那么控制台输出的结果就是两条
           并行程序的运行结果总和，这个结果需要折开成两部分看，
           就可以看到，各自是保持自己的输出顺序，
           这个就是多线程的异步，这个异步相当于执行to.start()的主程序来说
           简单来说开启了线程之后run方法中运行的代码主程序中的t0.start()
           之后的程序是并行执行的，没先后关系，这个叫异步
         **/
    }
}
