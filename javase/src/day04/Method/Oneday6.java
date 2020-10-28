package day04.Method;

/**
 * Author wangyi
 * Create 2020-09-16 22:56
 * ClassName Oneday6
 * Version 1.0
 */
public class Oneday6 {
    public static void main(String[] args) {
        Method method = new Method();
        //数组方式
        String[] ss = new String[]{"姓名", "年龄", "性别"};
        method.printIfo(ss);

        //java...特有方式，也可用数组方式
        method.printIfo1("李四","男","24","住在上海","学生");
    }
}
