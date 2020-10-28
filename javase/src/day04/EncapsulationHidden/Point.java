package day04.EncapsulationHidden;

/**
 * 定义一个点来表示三维空间中的点(有三个坐标)。
 * 1、可以生成具有特定坐标的点对象
 * 2、提供可以设置三个坐标的方法
 * Author wangyi
 * Create 2020-09-08 23:06
 * ClassName Point
 * Version 1.0
 */
public class Point {
    //1、可以生成具有特定坐标的点对象
    public Point(int c, int v, int b) {
        x = c;
        y = v;
        z = b;
    }

    public int x;
    public int y;
    public int z;

    //2、提供可以设置三个坐标的方法
    public void setPoint(int c, int v, int b) {
        x = c;
        y = v;
        z = b;
    }
}