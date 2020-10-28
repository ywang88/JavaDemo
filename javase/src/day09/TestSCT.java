package day09;

/**
 * Author wangyi
 * Create 2020-09-21 21:45
 * ClassName TestSCT
 * Version 1.0
 */
public class TestSCT {
    public static void main(String[] args) {
        SCTeacher scTeacher=new SCTeacher();
        scTeacher.setInfo();
        scTeacher.showInfo();
        scTeacher.fry();
        scTeacher.sing();

        Cooking cooking=new SCTeacher();
        cooking.fry();
    }
}
