package day05;

/**
 * Author wangyi
 * Create 2020-09-16 23:00
 * ClassName BigStudent
 * Version 1.0
 */
public class BigStudent extends Student {

    //在父类只有只有有参构造可以使用的时候，子类必须显示的构建一个构造来调用父类的有参构造，并且调用父类构造方法super要写在第一行
//    public BigStudent(String school) {
//        super(school);
//    }

    //调用Student默认无参构造 与Student student = new Student()效果相同
    public BigStudent(){
        super();
    }
    public void test() {
        //追溯父类变量
        super.sex = 1;//可以使用super可以向上追溯父类的父类，当然可以一直追溯，如果有那么多个层级的父类的话
        super.school = "上海大学";
        //追溯父类的方法与父类的父类的方法
        super.studentshowInfo();
        super.showInfo();
        super.showsex();


    }

//    public static void main(String[] args) {
//        Student student = new Student(); //调用Student默认无参构造
//
//    }
}
