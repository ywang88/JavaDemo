package day04;

/**
 * Author wangyi
 * Create 2020-09-16 22:48
 * ClassName Oneday5
 * Version 1.0
 */
public class Oneday5 {
    public static void main(String[] args) {


        //实例化Person类对象
        Person person = new Person();
        person.name = "张三";
        person.showName();
        person.age = 11;
        int i = person.age;
        System.out.println(i);

        //实例化Animal类对象
        Animal animal = new Animal();
        animal.setfood("老鼠");
        animal.moveType("飞");

//实例化Student对象
        Student student = new Student();
        student.name = "张二";
        student.age = "12";
        student.course = "体育课";
        student.interest = "打篮球";
        student.showInfo();

        //使用匿名对象，不定义对象,只使用一次建议使用匿名对象
        new Student().showinfo();

        Oneday5 oneday5 = new Oneday5();
        int area = oneday5.getArea(4, 7);
        System.out.println(area);


        //计算圆的面积,匿名对象
        double areas = new Circle().areas(4);
        System.out.println("圆的面积为:" + areas);


        //重载练习
        Overload overload = new Overload();
//        overload.mOL(5);
//        overload.mOL("你好我是重载方法输出的字符串");
//        overload.mOL(4, 56);
        overload.max(6, 32);
        overload.max(0.4,6.5);
        overload.max(213.3,3253.1,3253.11);
    }

    public int getArea(int x, int y) {
        return x * y;
    }
}
