package day04;

/**
 * Author wangyi
 * Create 2020-09-16 22:48
 * ClassName Overload
 * Version 1.0
 */
public class Overload {
    public void mOL(int c) {
        System.out.println(c * c * c);
    }

    public void mOL(int x, int y) {
        System.out.println(x * y);
    }

    public void mOL(String s) {
        System.out.println(s);
    }


    public void max(int s, int y) {
        if (s > y) {
            System.out.println("最大值是:" + s);
        } else {
            System.out.println("最大值是:" + y);
        }
    }

    public void max(double x, double y) {
        double res = 0;
        if (x > y) {
            res = x;
        } else {
            res = y;
        }
        System.out.println("最大值是:" + res);
    }

    public void max(double a, double b, double c) {
        double res = 0;
        if (a > c) {
            if (a > c) {
                res = a;
            } else {
                res = c;
            }
        } else {
            if (b > c) {
                res = b;
            } else {
                res = c;
            }
        }
        System.out.println("最大值是:" + res);
    }
}
