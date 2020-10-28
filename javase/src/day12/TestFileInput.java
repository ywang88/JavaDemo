package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Author wangyi
 * Create 2020-09-24 23:25
 * ClassName TestFileInput
 * Version 1.0
 */
public class TestFileInput {
    public static void main(String[] args) {
//        TestFileInput.testFileInputStrem();
        TestFileInput.testOutputStream();
        TestFileInput.copyFile("Z:\\test\\tt4.txt", "Z:\\test\\bb\\tt4.txt");
    }

    /*
     * 文件字节输入流.从硬盘中读取
     * @Author wangyi
     * @Date 23:43 2020/9/24
     * @Param []
     * @return void
     **/
    public static void testFileInputStrem() {
        //读取一个文件内容
        try {
            FileInputStream in = new FileInputStream("Z:\\test\\tt1.txt");
            //设置一个byte数组接受读取的文件内容
            byte[] b = new byte[10];
            //设置一个数组的长度
            int len = 0;
           /* 读取流，in.read()方法有一个返回值，返回值是读取的数据长度，如果读取到最后一个数据，还会向后读一个，
            也意味着当in.read()的返回值是-1是整个文件就读取完了*/
            //in.read(b);
            while ((len = in.read(b)) != -1) {
                //new String(b, 0, len)三个参数，参数1是缓冲数据的数组，参数2是丛数组的那个位置开始转化字符串，参数3是总共需要转化的长度
                System.out.println(new String(b, 0, len));
            }
            //关闭流，使用后一定要关闭
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*
     * 文件字节输出流，从内存中
     * @Author wangyi
     * @Date 23:46 2020/9/24
     * @Param []
     * @return void
     **/
    public static void testOutputStream() {
        try {
            //指定输出位置
            FileOutputStream ou = new FileOutputStream("Z:\\test\\tt4.txt");
            String str = "哈哈哈哈哈哈哈";//输出内容
            ou.write(str.getBytes());//把数据读取到内存
            ou.flush();//把内存中的数据写到硬盘
            ou.close();//关闭流
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * 将文件拷贝到另一个文件夹
     * outPath
     * @Author wangyi
     * @Date 0:03 2020/9/25
     * @Param [inPath 原文件位置, outPath 复制到的文件位置]
     * @return void
     **/
    public static void copyFile(String inPath, String outPath) {

        try {
            FileInputStream in = new FileInputStream(inPath);
            FileOutputStream ou = new FileOutputStream(outPath);
            byte[] b = new byte[100];
            int len = 0;
            while ((len = in.read(b)) != -1) {
                ou.write(b, 0, len);
            }
            ou.flush();
            ou.close();
            ;
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
