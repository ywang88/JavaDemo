package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Author wangyi
 * Create 2020-09-23 22:03
 * ClassName Testcollections
 * Version 1.0
 */
public class Testcollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("a");
        list.add("cb");
        list.add("b");
        list.add("b");
        list.add("aa");
        System.out.println(list);
        //reverse反转集合元素排序
        Collections.reverse(list);
        System.out.println(list);
        //shuffle对集合进行随机排序
        Collections.shuffle(list);
        System.out.println(list);
        //sort对集合元素进行字典排序
        Collections.sort(list);
        System.out.println(list);
        //swap替换集合中元素的位置
        Collections.swap(list, 0, 3);
        System.out.println(list);
        //frequency返回集合中指定元素出现的次数
        System.out.println(Collections.frequency(list, "b"));
        //max输出集合中最大的值
        System.out.println(Collections.max(list));
        //min输出集合中最小的值
        System.out.println(Collections.min(list));

        //5、实例化对象==赋值
        student student = new student(13, "张三");
        student student1 = new student(60, "李四");
        student student2 = new student(41, "王五");
        student student3 = new student(134, "赵六");
        //6、把对象放进集合中
        List<student> list1 = new ArrayList<student>();
        list1.add(student);
        list1.add(student1);
        list1.add(student2);
        list1.add(student3);

        //取得对象最大最小的值
        student s = Collections.max(list1, new student());
        System.out.println(s.name + "  " + s.age);
        student ss = Collections.min(list1, new student());
        System.out.println(ss.name + "  " + ss.age);

        //7、使用for-each遍历集合==取出集合中的值
        for (student std : list1) {
            System.out.println(std.name + "  " + std.age);
        }
        //8、使用sort方法排序
        Collections.sort(list1, new student());
        System.out.println("--------------");
        for (student std : list1) {
            System.out.println(std.name + "  " + std.age);
        }
    }
}

//给集合排序
//1、实现Comparator方法
class student implements Comparator<student> {
    //2、添加属性
    int age;
    String name;

    //4、添加有参无参的构造器
    public student() {
    }

    public student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //3、重写Comparator接口中的compare方法进行通过age排序
    @Override
    public int compare(student o1, student o2) {
        //根据年龄排序
        if (o1.age > o2.age) {
            return 1;
        } else if (o1.age < o2.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
