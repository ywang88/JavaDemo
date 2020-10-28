package day04.EncapsulationHidden;

/**
 * Author wangyi
 * Create 2020-09-16 22:52
 * ClassName Person1
 * Version 1.0
 */
public class Person1 {
    public  Person1(int v,String c){
        age =v;
        name=c;
    }
    public int age;
    public String name;

    public void showinfo(){
        System.out.println(age);
        System.out.println(name);
    }
}
