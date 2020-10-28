package day04;

/**
 * Author wangyi
 * Create 2020-09-16 22:49
 * ClassName Animal
 * Version 1.0
 */
public class Animal {
    String name;
    int eve;
    int logs;

    /*
     * @Author wangyi
     * @Date 22:46 2020/9/3
     * @Param [food]
     * @return void
     **/
    public void setfood(String food) {
        System.out.println("该动物的食物是:" + food);
    }

    /*
     * @Author wangyi
     * @Date 22:46 2020/9/3
     * @Param [moveType]
     * @return void
     **/
    public void moveType(String moveType) {
        System.out.println("该动物的移动方式为:" + moveType);
    }
}
