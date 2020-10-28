package day08;

/**
 * 单例设计模式，解决new对象消耗大量的时间与内存
 * 饿汉式
 * Author wangyi
 * Create 2020-09-15 22:59
 * ClassName Single
 * Version 1.0
 */
public class Single {
    /* 假设构造中药执行1000行代码，要占用很大的资源，耗时很长（10秒）
     每一次 new sing1e对需要10秒，运行1000行代码
     像这种情况，就适含使用单例模式，只new一次对象，以后一直使用这个对象*/
    //私有构造，构造方法私有化，调用这个类的人不能直接使用new类创建对象
    private Single() {
    }

    //私有的Single类型的类变量，不能通过类名.属性名调用
    private static Single single = new Single();

    public static Single getInstance() {
        return single;
    }
}
