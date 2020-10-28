package day10;

/**
 * 捕获异常
 * Author wangyi
 * Create 2020-09-21 23:08
 * ClassName Test
 * Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        A a = null;
        String[] str = new String[]{"sa", "fd"};

        try {
            System.out.println(str[3]);
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }

    }
}

class A {
    int i;
}
