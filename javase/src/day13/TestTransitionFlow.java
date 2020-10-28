package day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 转换流
 * 可以把字节流转化为字符流
 * 当字节流中的数据都是字符的时候，使用转换流处理效率更高
 * Author wangyi
 * Create 2020-09-27 23:36
 * ClassName TestStreamReader
 * Version 1.0
 */
public class TestTransitionFlow {
    public static void main(String[] args) {
        try {
            //TestStreamReader.testInputStreamReader();
            TestTransitionFlow.testOutputStreamReader();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //转换字节输入流为字符输入流
    public static void testInputStreamReader() throws Exception {
        FileInputStream fi = new FileInputStream("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\tt.txt");
        //把字节流转换为字符流
        /* 注意，在转换字符流的时候，设置的字符集编码要与读取的文件数据的编码
        一致，不然就会乱码*/
        //  InputStreamReader isr = new InputStreamReader(fi, "GBK");
        InputStreamReader isr = new InputStreamReader(fi, "UTF-8");
        char[] c = new char[100];
        int len = 0;
        while ((len = isr.read(c)) != -1) {
            System.out.println(new String(c, 0, len));
        }
        isr.close();
        fi.close();
    }

    //转换字节输出流为字符输出流
    public static void testOutputStreamReader() throws Exception {
        FileOutputStream fo = new FileOutputStream("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\tt1.txt");
        /* 注意，在转换字符流的时候，设置的字符集编码要与读取的文件数据的编码
        一致，不然就会乱码*/
//        OutputStreamWriter osw = new OutputStreamWriter(fo, "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(fo, "UTF-8");
        String s = "你好，转换输出流 ";
        osw.write(s);
        osw.flush();
        osw.close();
        fo.close();
    }
}
