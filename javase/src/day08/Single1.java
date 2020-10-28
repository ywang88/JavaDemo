package day08;

/**
 * 懒汉式单例
 * Author wangyi
 * Create 2020-09-15 23:42
 * ClassName Single1
 * Version 1.0
 */
public class Single1 {
    //1、先私有化构造器，让其他人无法直接new
    private Single1() {
    }

    //2、私有化类变量使用static关键字修饰
    private static Single1 single1 = null;

    public static Single1 getInstance() {
        //1、先判断是不是第一调用，如果是则new Single,如果不是则直接调用对象
        if (single1 == null) {
            single1 = new Single1();
        }
        return single1;
    }

}
