package day14;

/**
 * Author wangyi
 * Create 2020-10-09 22:11
 * ClassName Studetn
 * Version 1.0
 */
public class Studetn extends Person implements Move, Study {

    public Studetn() {
        System.out.println("调用的是 public Studetn()");
    }

    public Studetn(String school) {
        this.school = school;
        System.out.println("调用的是 public Studetn(String school)");
    }

    private Studetn(String school, int age) {
        this.school = school;
        this.age = age;
        System.out.println("调用的是  private Studetn(String school, int age)");
    }

    public String school;
    private String privateFiled;

    public void showInfo() {
        System.out.println("学校是：" + this.school);
    }

    @Override
    public void moveType() {
        System.out.println("开飞机上学");
    }

    @Override
    public void stutyInfo() {
        System.out.println("学习的是英语");
    }

    private void test(String name) {
        System.out.println("这是私有方法");
    }

    public String getSchool() {
        return this.school;
    }

    public void setInfo(String name, String school) {
        this.name = name;
        this.school = school;
        System.out.println("这个是public String setInfo(String name, String school)方法");
    }

    public void setInfo(int age) {
        System.out.println("这个是重载方法");

    }
}

