package day08;

/**
 * Author wangyi
 * Create 2020-09-15 22:21
 * ClassName Chinese
 * Version 1.0
 */
public class Chinese {
    public Chinese() {
        Chinese.count += 1;
    }

    static String country;//类变量，不用实例化就可以使用。通过类名.属性名调用
    //实例变量，只有实例化后可以使用，属于实例化的一部分
    String name;
    int age;

    public static int count;//记录country被new的按次数

    //通过类名.方法名调用
    public static void test() {
        System.out.println("这是一个静态方法");
    }

    public static void showCount() {
        System.out.println("Chinese总共被new了" + Chinese.count + "个对象");
    }
}
