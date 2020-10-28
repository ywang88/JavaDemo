package day11;

import java.util.ArrayList;
import java.util.List;

/**
 * Author wangyi
 * Create 2020-09-23 23:21
 * ClassName Test1
 * Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        D d = new D();
        List<String> l1 = new ArrayList<String>();
        d.test(l1);
        List<Integer> l2 = new ArrayList<Integer>();
        d.test(l2);

    }
}

class D {
    //test方法需要一个list集合，不确定list集合到底是存什么数据类型
    public void test(List<?> list) {

    }
}
