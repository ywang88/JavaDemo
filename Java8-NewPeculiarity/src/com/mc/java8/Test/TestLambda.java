package com.mc.java8.Test;

import com.mc.java8.Meth.FilterEmployeeByAge;
import com.mc.java8.Meth.FilterEmployeeByWage;
import com.mc.java8.Meth.MyPredicate;
import com.mc.java8.entity.Employee;
import org.junit.Test;

import java.util.*;

/**
 * Author wangyi
 * Create 2020-10-27 23:15
 * ClassName TestLambda
 * Version 1.0
 */
public class TestLambda {

    //原来的匿名内部类
    @Test
    public void test1() {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        TreeSet<Integer> ts = new TreeSet<>(com);
    }

    //Lambda表达式
    @Test
    public void test2() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        TreeSet<Integer> ts = new TreeSet<>(com);
    }


    List<Employee> employees = Arrays.asList(
            new Employee("张三", 55, 9999.99),
            new Employee("李四", 45, 7777.77),
            new Employee("王五", 35, 5555.55),
            new Employee("赵六", 25, 3333.33),
            new Employee("田七", 15, 1111.11)
    );

    //需求:获取当前公司中员工年龄大于35的员工
    @Test
    public void test3() {
        List<Employee> list = filterEmployees(employees);
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    public List<Employee> filterEmployees(List<Employee> list) {
        List<Employee> emps = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.getAge() > 35 && employee.getWage() > 8000) {
                emps.add(employee);
            }
        }
        return emps;
    }

    //供调用的方法
    public List<Employee> filterEmployee(List<Employee> list, MyPredicate<Employee> mp) {
        List<Employee> emps = new ArrayList<>();
        for (Employee employee : list) {
            if (mp.test(employee)) {
                emps.add(employee);
            }
        }
        return emps;
    }

    //优化方式一：策略设计模式
    @Test
    public void test4() {
        List<Employee> list = filterEmployee(employees, new FilterEmployeeByAge());
        for (Employee employee : list) {
            System.out.println(employee);
        }
        System.out.println("----------------");
        List<Employee> list1 = filterEmployee(employees, new FilterEmployeeByWage());
        for (Employee employee : list1) {
            System.out.println(employee);
        }
    }

    //优化方式二：匿名内部类
    @Test
    public void test5() {
        List<Employee> list = filterEmployee(employees, new MyPredicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getWage() <= 3000;
            }
        });
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    //优化方式三:lambda表达式
    @Test
    public void test6() {
        List<Employee> list = filterEmployee(employees, (employee -> employee.getWage() > 5000));
        list.forEach(System.out::println);
    }

    //优化方式四:Stram API
    //limit：显示几条数据
    @Test
    public void test7() {
        //根据年龄取出集合中的数据
        employees.stream()
                .filter((employee -> employee.getAge() > 20))
                .limit(4)
                .forEach(System.out::println);
        System.out.println("--------------------");

        //取出集合中所有的name
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }


}
