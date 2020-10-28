package day08;

/**
 * Author wangyi
 * Create 2020-09-16 23:04
 * ClassName Utils
 * Version 1.0
 */
public class Utils {
    //判断字符串是不是一个空字符串
    public static boolean isEmpt(String s) {
        boolean flag = false;
        if (s != null && s.equals("")) {
            flag = true;
        }
        return flag;
    }
}
