package day13;

import java.io.*;

/**
 * 缓冲字节流
 * Author wangyi
 * Create 2020-09-27 22:20
 * ClassName TestBufferedInputStream
 * Version 1.0
 */
public class TestBufferedByteFlow {
    public static void main(String[] args) throws Exception {
        //  TestBufferedInputStream.testBufferedInputStream();
        //  TestBufferedInputStream.testBufferedOutputStream();
        TestBufferedByteFlow.copyFile();
    }

    /*
     * 缓冲字节输入流
     * @Author wangyi
     * @Date 22:25 2020/9/27
     * @Param []
     * @return void
     **/
    public static void testBufferedInputStream() throws Exception {
        //文件字节输入流对象
        FileInputStream fm = new FileInputStream("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\note13.md");
        //缓冲字节输入流对象
        BufferedInputStream br = new BufferedInputStream(fm);

        byte[] b = new byte[100];
        int len = 0;
        while ((len = br.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }

        br.close();
        fm.close();
    }

    /*
     * 缓冲字节输出流
     * @Author wangyi
     * @Date 22:34 2020/9/27
     * @Param []
     * @return void
     **/
    public static void testBufferedOutputStream() throws Exception {
        //字节输出流对象
        FileOutputStream fo = new FileOutputStream("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\notetest13.md");
        //把字节输出流对象放到缓冲流对象
        BufferedOutputStream bo = new BufferedOutputStream(fo);
        String s = "hello BufferedOutputStream";
        bo.write(s.getBytes());//写道内存中
        bo.flush();//刷到硬盘里
        bo.close();
        fo.close();
    }

    /*
     * 缓冲流实现文件复制
     * @Author wangyi
     * @Date 22:48 2020/9/27
     * @Param []
     * @return void
     **/
    public static void copyFile() throws Exception {
        //构建文件缓冲输入流对象
        BufferedInputStream bf = new BufferedInputStream(new FileInputStream("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\notetest13.md"));
        //构建文件缓冲输出流对象
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\notecopy13.md"));
        //构建数组存放数据
        byte[] b = new byte[1024];
        //设置一个读取到到数据长度，直到bf.read方法执行到最后
        int len = 0;

        while ((len = bf.read(b)) != -1) {
            //数据写道内存中
            bo.write(b, 0, len);
        }
        //再把数据写到硬盘中
        bo.flush();

        //关闭流
        bo.close();
        bf.close();
    }
}
