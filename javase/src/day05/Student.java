package day05;

/**
 * Author wangyi
 * Create 2020-09-16 23:00
 * ClassName Student
 * Version 1.0
 */
public class Student extends Person {
    public Student() {
        System.out.println("super调用父类的构造器");
    }

    //当类有显示的构造方法，类就没有默认的无参构造了，而是要使用显示的构造
    public Student(String school) {
        this.school = school;
        System.out.println("super调用父类的构造器");
    }

    public String school;


    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void printage() {
        System.out.println(this.school);
    }

    public void studentshowInfo() {
        System.out.println(this.sex);
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.school);
    }


    //重写父类的方法
    @Override
    public void showsex() {
        System.out.println("我是重写并覆盖父类方法后的输出");
        //super调用父类的方法并输出我是super调用父类方法后的输出
        super.showsex();
        System.out.println("我是super调用父类方法后的输出");
    }

    //重写父类的方法
    @Override
    public void showInfo() {
        System.out.println("以下是student类对Person类的showInfo()方法重写");
        System.out.println(this.sex);
        System.out.println(this.age);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
//        Student student = new Student();
//        student.school = "sssss";
//        student.showInfo();
//        student.showsex();

//        Person p = new Person();
//        p.age = 1;
//        Person ps = new Student();

        //      ps.school="sssss";//属性是编译时确定的，编译时ps为Person类型，没有school成员变量，因而编译错误
//        student.setAge(101);
//        student.setSex(1);
//        student.showage();
//        student.showsex();

        Student student = new Student();
        //      student.showInfo();//掉用student类showInfo方法
        Person person = new Person();
        //      person.showInfo();//掉用Person类showInfo方法
        Person ps = new Student();
        //   ps.showInfo();//掉用student类重写Person类的showInfo方法
        //instanceof关键字使用 判断 person instanceof  Person 检验某个对象是否是类的子类，返回值为boolean类型
        System.out.println(person instanceof Person );
        System.out.println(student instanceof Person );
        System.out.println(person instanceof Student );
        System.out.println(ps instanceof Student );
        System.out.println(ps instanceof Person );

    }
}
