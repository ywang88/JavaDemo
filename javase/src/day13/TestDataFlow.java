package day13;

import java.io.*;

/**
 * 数据流
 * Author wangyi
 * Create 2020-09-29 22:42
 * ClassName TestDataFlow
 * Version 1.0
 */
public class TestDataFlow {
    public static void main(String[] args) {
        try {
            TestDataFlow.testDataInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * 数据输出流
     * 用数据流写到文件中的基本数据类型的数据，是乱码的，不能直接辨认出来，需要数据输入流来读取
     * @Author wangyi
     * @Date 22:46 2020/9/29
     * @Param []
     * @return void
     **/
    public static void testDataOutputStream() throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\tt4.txt"));
        dos.writeBoolean(true);
        dos.close();
    }

    /*
     *数据输入流
     * 用数据流写到文件中的基本数据类型的数据，是乱码的，不能直接辨认出来，需要数据输入流来读取
     * 用数据输入流读取数据输出流写到文件中的数据时，要保证使用和当时写的数据类型一致的类型来读取
     * 也就是说，如果写的时候是writeDouble,读的时候就得是readDoublee
     * @Author wangyi
     * @Date 22:50 2020/9/29
     * @Param []
     * @return void
     **/
    public static void testDataInputStream() throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\tt4.txt"));
        System.out.println(dis.readBoolean());
        dis.close();
    }
}
