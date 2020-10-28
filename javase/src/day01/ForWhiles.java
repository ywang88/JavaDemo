package day01;

/**
 * Author wangyi
 * Create 2020-09-16 22:58
 * ClassName ForWhiles
 * Version 1.0
 */
public class ForWhiles {
    public static void main(String[] args) {
//        for (int i = 0; i < 6; i++) {
//            System.out.println("外循环--" + i);
//            for (int k = 0; k < 2; k++) {
//                System.out.println("内循环--" + k);
//
//            }
//        }


        //九九乘法表

//        for (int s = 1; s <= 9; s++) {
//            for (int f = 1; f <= s; f++) {
//                System.out.print(f + "*" + s + "=" + (s * f) + " ");
//            }
//            System.out.println();
//        }
        //1-100的质数，（质数是一个大于1的自然数只能被1与本身整除）
        for (int y = 1; y <= 100; y++) {
            int p = 0;
            for (int u = 1; u <= y; u++) {
                if (y % u == 0) {
                    p++;
                }

            }
            if (p == 2) {
                System.out.println(y);
            }
        }

    }
}
