package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 缓冲字符流
 * Author wangyi
 * Create 2020-09-27 22:58
 * ClassName TestBufferedReader
 * Version 1.0
 */
public class TestBufferedChartFlow {
    public static void main(String[] args) {
        try {
            //TestBufferedReader.testBufferedReader();
            //TestBufferedReader.testBufferedWriter();
            TestBufferedChartFlow.copyfile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * 缓冲字符输入流
     * @Author wangyi
     * @Date 23:07 2020/9/27
     * @Param []
     * @return void
     **/
    public static void testBufferedReader() throws Exception {
        FileReader fr = new FileReader("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\note13.md");
        BufferedReader br = new BufferedReader(fr);
        char[] c = new char[100];
        int len = 0;
        while ((len = br.read(c)) != -1) {
            System.out.println(new String(c, 0, len));
        }

        br.close();
        fr.close();
    }

    /*
     * 缓冲字符输入流
     * @Author wangyi
     * @Date 23:07 2020/9/27
     * @Param []
     * @return void
     **/
    public static void testBufferedWriter() throws Exception {
        FileWriter fw = new FileWriter("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\BufferedWriternote.md");
        BufferedWriter bw = new BufferedWriter(fw);
        String s = "hello  BufferedWriter";
        bw.write(s);
        bw.flush();
        bw.close();
        fw.close();
    }

    /*
     * 缓冲字符流实现文件拷贝
     * @Author wangyi
     * @Date 23:07 2020/9/27
     * @Param []
     * @return void
     **/
    public static void copyfile() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\BufferedWriternote.md"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\BufferedWriternotecopy1.md"));
        char[] c = new char[1024];
        int len = 0;
        while ((len = br.read(c)) != -1) {
            bw.write(c, 0, len);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
