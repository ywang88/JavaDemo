package day09;

import sun.applet.Main;

/**
 * Author wangyi
 * Create 2020-09-21 22:13
 * ClassName TestBwm
 * Version 1.0
 */
public class TestBwm {
    public static void main(String[] args) {
        BWM bwm3=new BWM3Factry().productBwm();
        bwm3.showIfo();
        BWM bwm5=new BWM3Factry().productBwm();
        bwm5.showIfo();
        BWM bwm7=new BWM3Factry().productBwm();
        bwm7.showIfo();
    }
}
