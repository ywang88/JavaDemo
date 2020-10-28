package day05;

/**
 * Author wangyi
 * Create 2020-09-16 23:00
 * ClassName ObjectTest
 * Version 1.0
 */
public class ObjectTest {
    public void object(Object obj) {

    }

    public static void main(String[] args) {
        ObjectTest o = new ObjectTest();
        Person person = new Person();
        Student student = new Student();
        o.object(person);
        o.object(student);
//        o.object(new Kd());
        Person e=new Person();

//        e=person;
        System.out.println(e.equals(person));
        Object object=new Object();
        System.out.println(object.hashCode());
        System.out.println(object.toString());
    }



}
