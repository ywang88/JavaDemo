package day14;

import java.lang.reflect.Constructor;

/**
 * Author wangyi
 * Create 2020-10-09 22:18
 * ClassName TestClass
 * Version 1.0
 */
public class TestClass {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("day14.Studetn");

            Class cl = c.getSuperclass();//获取父类
            System.out.println("父类:" + cl.getName());
            Class[] interfaces = c.getInterfaces();//获取当前类的所有接口
            //遍历数组for-each
            for (Class c1 : interfaces) {
                System.out.println("接口：" + c1.getName());
            }

            /*   获取类的构造器*/
            //获取类的公有构造方法
            Constructor[] ctt = c.getConstructors();
            for (Constructor cstt : ctt) {
                //获得方法名称
                System.out.println("公有构造方法名称：" + cstt.getName());
                //getModifiers()获得方法的修饰符，返回数组1代表public
                System.out.println("公有构造方法：" + cstt.getName() + "的修饰符是" + cstt.getModifiers());
                //获取类的参数类型
                Class[] paramClass = cstt.getParameterTypes();
                for (Class cc1 : paramClass) {
                    System.out.println("构造方法:" + cstt.getName() + "的参数类型是:" + cc1.getName());
                }
            }

            //获取类的所有构造方法,公有+私有
            Constructor[] ctt1 = c.getDeclaredConstructors();
            for (Constructor cstt1 : ctt1) {
                System.out.println("------------------------------");
                System.out.println("所有构造方法名称:" + cstt1.getName());
                //getModifiers()获得方法的修饰符，返回数组1代表public,2代表private
                System.out.println("公有构造方法：" + cstt1.getName() + "的修饰符是" + cstt1.getModifiers());
                //获取类的参数类型
                Class[] paramClass = cstt1.getParameterTypes();
                for (Class cc1 : paramClass) {
                    System.out.println("构造方法:" + cstt1.getName() + "的参数类型是:" + cc1.getName());
                }
                System.out.println("------------------------------");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
