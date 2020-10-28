package day14;

import java.lang.reflect.Constructor;

/**
 * Author wangyi
 * Create 2020-10-09 22:55
 * ClassName TestClassNew
 * Version 1.0
 */
public class TestClassNew {
    public static void main(String[] args) {

        //通过反射的构造方法创建对象
        try {
            Class c = Class.forName("day14.Studetn");
            //相当于调用Studetn类的无参构造
            Object o = c.newInstance();
            Studetn stu = (Studetn) o;

            //指定获取有一个参数并且为string类型的公有构造
            Constructor c1 = c.getConstructor(String.class);
            //newInstance实例化对象，相当于调用public student(string school)
            Studetn stu1 = (Studetn) c1.newInstance("第一技校");
            System.out.println(stu1.school);

            //通过反射机制调用私有的构造方法
            Constructor c2 = c.getDeclaredConstructor(String.class, int.class);
            //解除私有的封装，下面就可以对这个私有方法调用
            c2.setAccessible(true);
            Studetn stu2 = (Studetn) c2.newInstance("张三", 14);
            System.out.println(stu2.school+" "+stu2.age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
