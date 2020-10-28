package com.mc.java8.Test;

import com.mc.java8.Meth.MyFuntion;
import com.mc.java8.Meth.MyfuntionJJCC;
import com.mc.java8.entity.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 练习一
 * Author wangyi
 * Create 2020-10-28 21:58
 * ClassName TestLambda2
 * Version 1.0
 */
public class TestLambda2 {

    List<Employee> emps = Arrays.asList(
            new Employee("张三", 55, 9999.99),
            new Employee("李四", 45, 7777.77),
            new Employee("王五", 35, 5555.55),
            new Employee("赵六", 25, 3333.33),
            new Employee("田七", 15, 1111.11)
    );

    /*    调用Collections.sort()方法，通过定制排序比较两个Employee
          (先按年龄排序，年龄相同按姓名比)，使用Lambda作为参数传递*/
    @Test
    public void test() {
        Collections.sort(emps, (e1, e2) -> {
            if (e1.getAge() == e2.getAge()) {
                return e1.getName().compareTo(e2.getName());
            } else {
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        });
        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }

    /*声明函数式接口，接口中申明抽象方法 public String getValue(String str);
    编写一个方法使用接口作为参数，将一个字符串转换成大写，并作为返回值、
    再将一个字符串的第二个和第四个索引位置精选截取子串*/
    @Test
    public void test1() {
        //去除前后空格
        String dasdasda = strHandler("\t\t\t dasdasda   ", (str) -> str.trim());
        System.out.println(dasdasda);
        //字符修改为大写
        String dasdasdas = strHandler("dasdasda", (str) -> str.toUpperCase());
        System.out.println(dasdasdas);
        //截断输出字符串
        String dasdasdass = strHandler("我是无所谓的哥哥", (str) -> str.substring(2, 5));
        System.out.println(dasdasdass);
    }

    //字符串处理方法
    public String strHandler(String str, MyFuntion mf) {
        return mf.getValue(str);
    }

    /* 申明一个带两个泛型的函数式接口，泛型类型为<T, R>T为参数，R为返回值
       接口中申明对象抽象方法
       编写方法，使用接口作为参数，计算两个long型参数的和。
       在计算两long型参数的乘机*/

    @Test
    public void test2() {
        numC(23L, 54L, (i, j) -> i * j);
        numC(23L, 54L, (i, j) -> i + j);
    }

    //对两个Long型数据进行处理
    public void numC(Long i, Long j, MyfuntionJJCC<Long, Long> mjc) {
        System.out.println(mjc.getNum(i, j));
    }
}
