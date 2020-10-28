package day13;

import java.io.*;

/**
 * 标准输入输出流
 * Author wangyi
 * Create 2020-09-27 23:57
 * ClassName TestInOut
 * Version 1.0
 */
public class TestInOutFlow {
    public static void main(String[] args) {
        try {
            // TestInOut.testSystemIn();
            // TestInOut.writertxt();
            TestInOutFlow.UserPasswd();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*
     * 标准的输入流
     * @Author wangyi
     * @Date 23:58 2020/9/27
     * @Param []
     * @return void
     **/
    public static void testSystemIn() throws Exception {
        //创建一个接收键盘输入的输入流
        InputStreamReader is = new InputStreamReader(System.in);
        //把输入流放到缓冲里
        BufferedReader br = new BufferedReader(is);
        //定义一个临时接收数据的字符串
        String s = "";
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();
        is.close();
    }

    /*把控制台输入的内容写到指定的txt文件中，当接收到字符串enter时
    ，就直接结束程序运行*/
    public static void writertxt() throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\tt2.txt"));
        String s = "";
        while ((s = br.readLine()) != null) {
            if (s.equals("enter")) {
                break;
            }
            bw.write(s);
        }
        bw.flush();
        bw.close();
        br.close();
        is.close();
    }

    /*  在一个txt文件中，写一组用户名和密码，通过控制台输入用户名和密码，
        与txt中的用户名密码做对比，如果一样就在打印登录成功，
        如果不超过就答应用户名密码错误*/
    public static void UserPasswd() throws Exception {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);

        FileInputStream fs = new FileInputStream("D:\\KFGJ\\Project\\Afterend\\java\\src\\day13\\tt.txt");
        BufferedInputStream bfi =
                new BufferedInputStream(fs);
        byte[] b = new byte[100];
        int len = 0;
        String s = "";
        while ((len = bfi.read(b)) != -1) {
            while ((s = br.readLine()) != null) {
                if (s.equals(new String(b, 0, len))) {
                    System.out.println("登录成功");
                } else {
                    System.out.println("登录失败");
                }
            }

        }
        bfi.close();
        fs.close();
        br.close();
        inputStreamReader.close();


    }
}
