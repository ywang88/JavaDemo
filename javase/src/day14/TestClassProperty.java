package day14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Author wangyi
 * Create 2020-10-09 23:32
 * ClassName TestClassProperty
 * Version 1.0
 */
public class TestClassProperty {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("day14.Studetn");
//
//            //获取类的公有属性，包含父类的公有属性
//            Field[] f = c.getFields();

            //获取本类的所有属性，包含公有+私有属性
            Field[] f = c.getDeclaredFields();
            for (Field f1 : f) {
                System.out.println("修饰符:" + f1.getModifiers());
                System.out.println("属性的类型:" + f1.getType());
                System.out.println("属性的名称:" + f1.getName());
            }

            //获取类所在的包
            Package p = c.getPackage();
            System.out.println(p.getName());


           /* 注意：下面不论是反射调用setInfo还是test方法, 都是调用obj方法
                    ，obj对象实际上就是student对象*/
            //调用方法
            //获取无参构造
            Constructor cc = c.getConstructor();
            //使用无参构造创建对象
            Object obj = cc.newInstance();
            //得到名称叫做setInfo的，参数是string
            Method m = c.getMethod("setInfo", String.class, String.class);
            m.invoke(obj, "张思", "精华大学");

            //调用一个私有方法
            Method m1 = c.getDeclaredMethod("test", String.class);
            //解除私有封装，下面可以强制调用私有的方法
            m1.setAccessible(true);
            m1.invoke(obj, "李四");

            //调用一个重载方法
            Method m2 = c.getMethod("setInfo", int.class);
            m2.invoke(obj, 1);

            //调用一个有返回值的方法
            Method m3 = c.getMethod("getSchool");
            String school = (String) m3.invoke(obj);
            System.out.println(school);


            /*调用属性*/
            //调用公共属性
            Constructor cc1 = c.getConstructor();
            Studetn studetn = (Studetn) cc1.newInstance();
            Field f1 = c.getField("school");
            f1.set(studetn, "第三中学");
            String s1 = (String) f1.get(studetn);
            System.out.println(s1);

            //调用私有属性
            Field f2 = c.getDeclaredField("privateFiled");

            //调用私有属性必须使用setAccessible(true)解除封装，下面才可以强制使用
            f2.setAccessible(true);
            f2.set(studetn, "哈哈，我是私有属性");
            System.out.println(f2.get(studetn));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
