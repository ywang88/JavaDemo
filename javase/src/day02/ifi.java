package day02;

/**
 * Author wangyi
 * Create 2020-09-16 22:42
 * ClassName ifi
 * Version 1.0
 */
public class ifi {
    public static void main(String[] args) {
        int i = 8;
        int k = 10;
        int j = 8;

        //找出两个数中的最大数
//        System.out.println(i > k ? i : k);
        //找出三个数中的最大数
        System.out.println(i > k ? (i > j ? i : j) : (k > j ? k : j));

        if (k % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }

        if (i == 5) {
            System.out.println("星期五");
        } else if (i == 4) {
            System.out.println("星期四");
        } else if (i == 3) {
            System.out.println("星期三");
        } else {
            System.out.println("超出能力范围");
        }

        int score = 66;
        if (score == 100) {
            System.out.println("奖励小明明一辆宝马");
        } else if (score > 60 && score <= 99){
            System.out.println("奖励小明明一个iphone5s");
        }else if (score<60 && score>0){
            System.out.println("小明回去多加练习");
        }else {
            System.out.println("小明没有参加考试");
        }
    }
}

