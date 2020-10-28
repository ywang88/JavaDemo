package day14;


import java.lang.reflect.Method;

/**
 * Author wangyi
 * Create 2020-10-09 23:13
 * ClassName TestClassMethod
 * Version 1.0
 */
public class TestClassMethod {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("day14.Studetn");

//            //获取类的所有公有的方法
//            Method[] m = c.getMethods();
            //获取类的所有的方法公有+私有
            Method[] m = c.getDeclaredMethods();
            for (Method method : m) {
                System.out.println("方法名:" + method.getName());
                System.out.println("返回值类型:" + method.getReturnType());
                System.out.println("修饰符:" + method.getModifiers());
                //获取方法的参数类型，是一个数组，方法有几个，数组就有几个
                Class[] pcs = method.getParameterTypes();
                //判断数组是否为空
                if (pcs != null && pcs.length > 0) {
                    for (Class pc : pcs) {
                        System.out.println("参数类型：" + pc.getName());
                    }
                }
                System.out.println("------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
