package day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化及反序列化
 * 注意：对象序列化与反序列化使用的类要严格一致，包名，类名，类结构等等
 * Author wangyi
 * Create 2020-09-29 23:14
 * ClassName TestPerson
 * Version 1.0
 */
public class TestPerson {
    public static void main(String[] args) {
        try {
            //TestPerson.testSerializable();
            TestPerson.testDeserializable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * 序列化输出流
     * @Author wangyi
     * @Date 23:19 2020/9/29
     * @Param []
     * @return void
     **/
    public static void testSerializable() throws Exception {
        //创建对象输出流，把对象序列化后的流放到指定文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\person.txt"));
        Person p = new Person();
        p.name = "张三";
        p.age = 14;
        //序列化Person对象后存到内存里
        oos.writeObject(p);
        //刷到硬盘
        oos.flush();
        //关闭流
        oos.close();
    }

    /*
     * 反序列化
     * @Author wangyi
     * @Date 23:21 2020/9/29
     * @Param []
     * @return void
     **/
    public static void testDeserializable() throws Exception {
        //创建对象输入流，从指定文件中把对象序列化后的流读取出来
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\person.txt"));
        Object obj = ois.readObject();
        Person p = (Person) obj;
        System.out.println(p.name);
        System.out.println(p.age);
    }
}
