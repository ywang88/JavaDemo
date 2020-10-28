package day13;

import java.io.RandomAccessFile;

/**
 * 随机流
 * Author wangyi
 * Create 2020-09-29 23:37
 * ClassName TestRandomFlow
 * Version 1.0
 */
public class TestRandomFlow {
    public static void main(String[] args) {
        try {
            //TestRandomFlow.testRandomAccessfileRead();
            TestRandomFlow.testRandomAccessfileWrite();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * 随机读
     * @Author wangyi
     * @Date 23:43 2020/9/29
     * @Param []
     * @return void
     **/
    public static void testRandomAccessfileRead() throws Exception {
       /* RandomAccessFile的构造有两个参数，参数一是读取文件的位置，
        参数二是指定RandomAccessFile的访问方式
        r:已只读方式打开
        rw:打开以便读取和写入
        rwd:打开以便读取和写入,同步更新文件内容
        rws:打开以便读取和写入，同步更新文件内容和元数据的更新*/

        RandomAccessFile raf = new RandomAccessFile("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\RandomFlow.txt", "r");
        //设置读取文件内容的位置
        raf.seek(3);
        //临时存放数据
        byte[] b = new byte[100];
        int len = 0;
        while ((len = raf.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }
        raf.close();
    }

    /*
     * 随机写
     * @Author wangyi
     * @Date 23:53 2020/9/29
     * @Param []
     * @return void
     **/
    public static void testRandomAccessfileWrite() throws Exception {
        RandomAccessFile raf = new RandomAccessFile("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\RandomFlow.txt", "rw");
        //注意:如果是在文件开头或文件中间的某个位置开始写的话，就会用写的内容覆盖掉等长度的原内容
        // raf.seek(0);//设置写的起始点，0代表从开头开始写
        //  raf.seek(8);设置自定义位置开始写
        raf.seek(raf.length());//设置写的起始点，raf.length()代表从文件的最后结尾写，也就是文件追加
        raf.write("你好".getBytes());
    }
}
