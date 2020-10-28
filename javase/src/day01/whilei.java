package day01;

/**
 * Author wangyi
 * Create 2020-09-16 22:58
 * ClassName whilei
 * Version 1.0
 */
public class whilei {
    public static void main(String[] args) {
//        int i =1;
//        while (i<=100){
//            System.out.println(i);
//            i++;
//        }

        //1-100之间偶数的和for写法
//        int o;
//        int sum = 0;
//        for (o = 1; o <= 100; o++) {
//            if (o % 2 == 0) {
//                sum += o;
//            }
//        }
//        System.out.println(sum);
//

        int k = 1;
        int sum1 = 0;
        while (k <= 100) {
            if (k % 2 == 0) {
                sum1 += k;
            }
            k++;
        }
        System.out.println(sum1);
    }
}
