package day12;

import java.io.File;
import java.io.IOException;

/**
 * Author wangyi
 * Create 2020-09-24 22:11
 * ClassName TestFile
 * Version 1.0
 */
public class TestFile {
    public static void main(String[] args) {
        File f = new File("Z:\\test\\tt1.txt");//这个时候f=tt.txt文件
        /*注意 '\'在文件中是分隔符，但是在Java编程中一个\的意思是转义符，在java
        中\\或者/才是文件的分隔符*/
        //也可以用File.separator作为分隔符
        //File f1 = new File("Z:" + File.separator + "test\\tt.txt");//这个时候f=tt.txt文件
        //使用相对路径创建file对象

        //访问文件
        File f1 = new File("src\\day12\\TestFile.java");
        //输出当前文件名或文件夹名
        System.out.println(f.getName());
        //获取文件的相对路径，就是new file时候写的路径
        System.out.println("该文件的相对路径:" + f1.getPath());
        //获取文件的绝对路径
        System.out.println("该文件的绝对路径:" + f1.getAbsolutePath());
        //返回一个用当前的文件的绝对路径构建的file对象
        System.out.println(f1);
        System.out.println(f1.getAbsoluteFile());
        //获取单曲文件的父级路径
        System.out.println(f1.getParent());
        //修改当前文件或文件夹名称
        f.renameTo(new File("Z:\\test\\tt1.txt"));
        System.out.println("----------检测文件---------");
        //检测文件
        //判断文件或文件夹是否存在
        System.out.println(f.exists());
        //判断文件是否可写
        System.out.println(f.canWrite());
        //判断文件是否可读
        System.out.println(f.canRead());
        //判断当前file是不是文件
        System.out.println(f.isFile());
        //判断当前file对象是不是文件夹或者目录
        System.out.println(f.isDirectory());
        //获取文件最后的修改时间，返回的是一个毫秒数
        System.out.println(f.lastModified());
        //返回文件的长度,字节数
        System.out.println(f.length());
        System.out.println("----------文件操作---------");
        //文件操作
        File f2 = new File("Z:\\test\\tt2.txt");//这个时候f=tt.txt文件
        System.out.println(f2.exists());
        //当前文件不存在则创建当前文件
        if (!f2.exists()) {
            try {
                f2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //删除一个文件
//        f2.delete();
        System.out.println("-------------------");
        //目录操作
        File f3 = new File("Z:\\test\\bb");//这个时候f=tt.txt文件
        //创建单层目录
        f3.mkdir();

        File f4 = new File("Z:\\test\\cc\\dd\\gg");//这个时候f=tt.txt文件
        //创建多层目录
        f4.mkdirs();

        System.out.println("--------获取当前文件夹下的所有子级的名称，包括目录和文件-----------");
        File f5 = new File("Z:\\test");
        //获取当前文件夹下的所有子级的名称，包括目录和文件
        //定义一个数组存放内容
        String[] st = f5.list();
        //使用for-each遍历出所有内容
        for (String s : st) {
            System.out.println(s);
        }
        System.out.println("--------获取当前文件夹下所有的文件-----------");
        //获取当前文件夹下所有的文件
        File[] fs = f5.listFiles();
        for (File ff : fs) {
            System.out.println(ff);
        }


        System.out.println("-----遍历Z盘下的test文件夹，把test文件夹下面的所有目录与文件全部遍历出来，不论层级，---------");
        System.out.println("使用递归方式");
        File file=new File("Z:\\test");
        new TestFile().test(file);
    }

    public void test(File file) {
        //1、判断该文件是文件还是文件夹
        if (file.isFile()) {
            System.out.println(file.getAbsolutePath() + "是文件");
        } else {
            System.out.println(file.getAbsolutePath() + "是文件夹");
            //2、是文件夹则获取该文件夹下面所有文件
            File[] file1 = file.listFiles();
            //判断当前文件夹下面是否为空
            if (file1 != null && file1.length > 0) {
                //遍历该文件夹下面所有文件或文件夹
                for (File file2 : file1) {
                    //与上面代码耦合度太高所以使用递归
                    test(file2);
                }
            }
        }
    }
}
