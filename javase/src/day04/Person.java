package day04;

/**
 * Author wangyi
 * Create 2020-09-16 22:48
 * ClassName Person
 * Version 1.0
 */
public class Person {
    String name; //成员变量-->实例变量
    int age;
    public static String sex = "男"; //成员变量-->类变量 可以直接通过类名.属性直接使用

    /*
     * @Author wangyi
     * @Date 22:21 2020/9/3
     * @Param []
     * @return void
     **/
    //方法可以被其他类调用
    public void showName() {
        String setName;//局部变量
        System.out.println("我的姓名为:" + name);
    }

    /*
     * @Author wangyi
     * @Date 22:21 2020/9/3
     * @Param []
     * @return int
     **/
    public int getAge() {
        return age;
    }

}
