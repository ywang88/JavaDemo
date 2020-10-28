package day04.EncapsulationHidden;

/**
 * Author wangyi
 * Create 2020-09-16 22:52
 * ClassName TestTriAngle
 * Version 1.0
 */
public class TestTriAngle {
    public static void main(String[] args) {
        TriAngle triAngle=new TriAngle();
        triAngle.setbh(34,56);
        System.out.println(triAngle.setbh(23,3));
    }
}
