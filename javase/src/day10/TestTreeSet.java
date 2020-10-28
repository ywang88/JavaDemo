package day10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet支持自然排序
 * Author wangyi
 * Create 2020-09-22 22:17
 * ClassName TestTreeSet
 * Version 1.0
 */
public class TestTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        System.out.println(set);
        /*遍历集合一种迭代器，一种for each*/
        //迭代器
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //for each 推荐
        for (Object obj : set) {
            System.out.println(obj);
        }
    }
}
