package day04.EncapsulationHidden;

/**
 * Author wangyi
 * Create 2020-09-16 22:52
 * ClassName Oneday7
 * Version 1.0
 */
public class Oneday7 {
    public static void main(String[] args) {
        Person person=new Person();
        person.setAge(56);
//        person.printage();
        person.getAge();
        System.out.println("年龄是:"+person.getAge());


        Person1 person1=new Person1(45,"李四");
        person1.showinfo();


        Point point=new Point(7,8,8);
        point.setPoint(3,45,6);
    }

}
