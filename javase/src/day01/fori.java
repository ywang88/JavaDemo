package day01;

/**
 * Author wangyi
 * Create 2020-09-16 22:40
 * ClassName fori
 * Version 1.0
 */
public class fori {
    public static void main(String[] args) {
//        int x;
//        for (x = 2; x <= 20; x = x * 2 - 1) {
//            System.out.println("This is x:" + x);
//        }

//        int x, y;
//        y = 20;
//        for (x = 0; x < 10; x++) {
//            System.out.println("x=" + x);
//            System.out.println("y=" + y);
//            y = y - 2;
//        }

        double x = 3.0, y = 5.0;
        double c = Math.sqrt(x * x + y * y);
        System.out.println("Hypotenuse is:" + c);
        int i;
        for (i = 0; i <= 5; i++) {
            System.out.println("练习乾坤大挪移第" + i + "偏");
        }

        //从1循环到150并在每行打印一个值，
        // 另外在每个3的倍数行上打印出“foo”
        //在每个5的倍数行上打印出“biz”
        // 在每个7的倍数行上打印出“baz”
        for (int o = 1; o <= 150; o++) {
            String str = "";
            str += o;
            if (o % 3 == 0) {
                str += " foo";
            }
            if (o % 5 == 0) {
                str += " biz";
            }
            if (o % 7 == 0) {
                str += " baz";
            }
            System.out.println(str);
        }

        //输出1-100奇数之和
        int num = 0;
        for (int p = 1; p <= 100; p++) {
            if (p % 2 != 0) {
                num += p;
            }
        }
        System.out.println(num);


        //1-100之间是7 的倍数的整数个数及总和
        int num2 = 0;
        int sum = 0;
        for (int s = 1; s <= 100; s++) {
            if (s % 7 == 0) {
                sum += s;
                num2++;
            }

        }
        System.out.println("7的倍数个数:" + num2);
        System.out.println("7的倍数之和为:" + sum);


        //输出100至1000之间的水仙花数
        //方法一
        int sum1, g, h, j;
        for (sum1 = 100; sum1 < 1000; sum1++) {
            g = sum1 % 10;
            h = (sum1 - g) / 10 % 10;
            j = sum1 / 100;
            if (sum1 == g * g * g + h * h * h + j * j * j) {
                System.out.println(sum1);
            }

        }
        //方法二
        for (int df = 100; df < 1000; df++) {
            //145 145/100=1,(145-1*100)/10=4,145-1*100-4*10=5
            int sum3, n, v, b;
            n = df / 100;//得到百位数
            v = (df - n * 100) / 10;
            b = df - n * 100 - v * 10;
            sum3 = n * n * n + v * v * v + b * b * b;
            if (sum3 == df) {
                System.out.println(sum3);
            }
        }

    }
}
