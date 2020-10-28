package day14;

/**
 * Author wangyi
 * Create 2020-10-09 21:58
 * ClassName Test
 * Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();

        /* 实例化Class类对象的(四种方法)*/
        //第一种，通过类名.class创建指定类的class实例
        Class c = Person.class;
        //第二种,通过一个类的实例对象的getClass()方法，获取对应实例对象
        //的类的class实例
        Class c1 = p.getClass();
        //第三种，通过class的静态方法forName(String className)来获取一个class实例
        //forName(String className)方法中的参数是你要获取的class实例的类全路径(包名.类名)
        //为获取class实例的常用方式
        //为获取class实例的常用方式
        try {
            Class c2 = Class.forName("day14.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //第四种
//        ClassLoader cl = this.getClass().getClassLoader();
//        try {
//            Class c3 = cl.loadClass("day14.Person");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }

}