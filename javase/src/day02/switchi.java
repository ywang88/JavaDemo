package day02;

import java.util.Scanner;

/**
 * Author wangyi
 * Create 2020-09-16 22:42
 * ClassName switchi
 * Version 1.0
 */
public class switchi {
    public static void main(String[] args) {
        int l = 4;
        switch (l) {
            case 1:
                System.out.println("one day");
                break;
            case 2:
                System.out.println("two day");
                break;
            default:
                System.out.println("no day");
                break;
        }

        char s = 'a';
        switch (s) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            default:
                System.out.println("other");
                break;
        }

        System.out.println("请输入张胜男的成绩:");
        Scanner cj = new Scanner(System.in);
        int score = cj.nextInt();
        if (score > 100) {
            System.out.println("分数大于100请检查!");
            return;
        }
        switch (score / 60) {
            case 1:
                System.out.println("合格");
                break;
            default:
                System.out.println("不及格");
                break;
        }

        System.out.println("请输入月份:");
        Scanner in = new Scanner(System.in);
        int month;
        month = in.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("秋季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("夏季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入错误！请输入数字1-12月");

                break;
        }
        System.out.println("请输入数字来计算结果:");
        Scanner sd = new Scanner(System.in);
        int b = sd.nextInt();
        switch (b) {
            case 1:
                b += 5;
                break;
            case 2:
                b += 8;
                break;
            case 3:
                b +=10;
                break;
            default:
                b +=12;
                break;
        }
    }
}
