package day04;

/**
 * Author wangyi
 * Create 2020-09-16 22:48
 * ClassName Student
 * Version 1.0
 */
public class Student {
    public String name;//姓名
    public String age;//年龄
    public String course;//课程
    public String interest;//兴趣

    /*
     * @Author wangyi
     * @Date 22:57 2020/9/3
     * @Param []显示学生个人信息
     * @return void
     **/
    public void showInfo() {
        System.out.println("姓名:" + name);
        System.out.println("年龄:" + age);
        System.out.println("课程:" + course);
        System.out.println("兴趣:" + interest);
    }
    public void showinfo() {
        System.out.println("姓名:" + name);
        System.out.println("年龄:" + age);
    }
}
