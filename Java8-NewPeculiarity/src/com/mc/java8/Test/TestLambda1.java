package com.mc.java8.Test;

import com.mc.java8.Meth.Myfun;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Lambda语法模式
 * Author wangyi
 * Create 2020-10-28 21:03
 * ClassName TestLambda1
 * Version 1.0
 * 左右遇一括号省
 * 左侧推断类型省
 */
public class TestLambda1 {

    @Test
    public void test() {
        int num = 1;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello runnable " + num);
            }
        };
        runnable.run();
        System.out.println("-------------");
        Runnable runnable1 = () -> System.out.println("hello Lamble");
        runnable1.run();
    }

    //语法格式一:无参数，无返回值
    @Test
    public void test1() {
        Consumer<String> com = (x) -> System.out.println(x);
        com.accept("无参数，无返回值");
    }

    //语法格式二:两个以上参数，有返回值，并且Lambda体中有多条语句
    @Test
    public void test2() {
        Comparator<Integer> com = (x, y) -> {
            System.out.println("函数式接口");
            return Integer.compare(x, y);
        };
    }

    //语法格式三:若Lambda体中只有一条语句，return和大括号可以省略不写
    @Test
    public void test3() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);

    }

    //语法格式四:Lambda表达式参数列表的数据类型可以省略不写，因为JVM编译器通过上下文推断出，数据类型，即"类型推断"
    @Test
    public void test4() {
        Comparator<Integer> com = (Integer x, Integer y) -> Integer.compare(x, y);
        //语法格式五:
    }


    //需求对一个数进行运算
    @Test
    public void test5() {
        //调用operation方法传入一个值，lambda拿到这个值根据lambda体进行运算
        Integer integer = operation(100, (x) -> x * x);
        System.out.println(integer);
        Integer integer2 = operation(100, (x) -> x + 300);
        System.out.println(integer2);
    }

    public Integer operation(Integer num, Myfun mf) {
        return mf.getnum(num);
    }
}