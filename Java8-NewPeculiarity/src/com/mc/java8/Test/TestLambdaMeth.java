package com.mc.java8.Test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Author wangyi
 * Create 2020-10-28 23:02
 * ClassName TestLambdaMeth
 * Version 1.0
 */
/*JAVA8内置的四大核心函数式接口
        Consumer<T>:消费型接口
        void accept(T t)；

        Supplier<T>:供给型接口
        T get();

        Function<T, R>:函数式接口
        R apply(T t);

        Predicate<T>:断言型接口
        boolean test(T t);
 */

public class TestLambdaMeth {
    //断言型接口:需求:将满足条件的字符串放入集合
    public List<String> getSize(List<String> list, Predicate<String> pt) {
        List<String> strlist = new ArrayList<>();
        for (String s : list) {
            if (pt.test(s)) {
                strlist.add(s);
            }
        }
        return strlist;
    }

    @Test
    public void test3() {
        List<String> list = Arrays.asList("sdasd", "asdasd", "ssd", "sda", "sd", "1");
        List<String> size = getSize(list, (s) -> s.length() > 3);
        for (String s : size) {
            System.out.println(s);
        }

    }



    //函数型接口:需求:处理字符串
    public String getchart(String str, Function<String, String> ft) {
        return ft.apply(str);
    }

    @Test
    public void test2() {
        //去除空格
        String getchart = getchart("\t\t\t 我的大中国真厉害", (s) -> s.trim());
        System.out.println(getchart);
        //把字符串变为大写
        String sssssss = getchart("sssssss", (s) -> s.toUpperCase());
        System.out.println(sssssss);
        //截取字符串
        String wdd = getchart("我的大中国真厉害", (s) -> s.substring(2, 5));
        System.out.println(wdd);
    }


    //供给型接口:需求:产生指定个数的整数，并放入集合中
    public List<Integer> getNum(int num, Supplier<Integer> sup) {
        //创建一个list集合
        List<Integer> list = new ArrayList<>();
        //产生元素
        for (int i = 0; i < num; i++) {
            //获取到产生的元素
            Integer n = sup.get();
            //把元素添加到集合里面去
            list.add(n);
        }
        //放回list集合
        return list;
    }

    @Test
    public void test1() {
        List<Integer> num = getNum(10, () -> (int) (Math.random() * 100));
        //for-each遍历出元素
        for (Integer integer : num) {
            System.out.println(integer);
        }
    }


    //消费型接口:需求:返回输入的值
    public void getVale(Integer money, Consumer<Integer> com) {
        com.accept(money);
    }

    @Test
    public void test() {
        getVale(1000, (i) -> System.out.println("刚哥去大宝剑本次消费了" + i));
    }
}
