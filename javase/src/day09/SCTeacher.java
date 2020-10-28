package day09;

/**
 * 这个是描述会唱歌的厨子是一个老师
 * Author wangyi
 * Create 2020-09-21 21:32
 * ClassName SCTeacher
 * Version 1.0
 */
public class SCTeacher extends Person1 implements Cooking, Sing {
    String course;//教的科目

    public void setInfo() {
        super.age = 45;
        super.name = "张三";
        super.sex = 1;
        this.course = "数学";
    }

    @Override
    public void showInfo() {
        System.out.println("会唱歌的厨子是一个老师的信息是:");
        System.out.println("姓名为:"+super.name);
        System.out.println("年龄为:"+super.age);
        if (sex == 0) {
            System.out.println("性别为:男");
        }
        if (sex == 1) {
            System.out.println("性别为:女");
        } else {
            System.out.println("不是男的页不是女的！！");
        }
        System.out.println("教授的课程为:"+this.course);
    }

    @Override
    public void fry() {
        System.out.println(super.name + "老师的厨艺是炒菜");
    }


    @Override
    public void sing() {
        System.out.println(super.name + "老师擅长美声唱法");
    }
}
