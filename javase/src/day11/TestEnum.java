package day11;

/**
 * Author wangyi
 * Create 2020-09-23 23:33
 * ClassName TestEnum
 * Version 1.0
 */
public class TestEnum {
    public static void main(String[] args) {
        //6、使用类名.构造方法.showInfo

        Season.SPRING.showInfo();
        Season.SUMMER.test();
    }
}

//1、定义枚举类
enum Season implements Testl {
    //2、调用Season构造方法
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "夏日炎炎"),
    AUTOMN("秋天", "秋高气爽"),
    WINTER("冬天", "寒风咧咧");
    //3、属性私有化
    private final String name;
    private final String desc;

    //4、私有构造方法
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    //5、输出信息
    public void showInfo() {
        System.out.println(this.name + "  " + this.desc);
    }

    @Override
    public void test() {
        System.out.println("枚举实现接口重写枚举的方法");
    }
}

interface Testl {
    void test();
}