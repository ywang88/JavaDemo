package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * add:"给集合添加元素",remove:"给集合移除元素",
 * contains:"判断是否包含元素",clear:"清空集合",
 * size:"判断集合大小",
 * 泛型
 * Author wangyi
 * Create 2020-09-22 21:52
 * ClassName TestHashSet
 * Version 1.0
 */
public class TestHashSet {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add("你好");
        set.add("我是");
        set.add("Set的");
        set.add("HashSet");
        set.add("集合");
        //可以存null,且无序
        set.add(null);
        //set集合村的值是不重复的
        set.add("集合");
//        System.out.println(set);
//        set.remove("你好");
//        System.out.println(set);
//        System.out.println(set.contains("你好"));
//        set.clear();
        System.out.println(set.size());
        System.out.println(set);

        /*遍历出集合的所有值*/
        //1、迭代器遍历集合
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //2、使用for each迭代集合
        for (Object obj : set) {
            //把set集合的每一个值取出来，赋值给obj,知道循环结束
            System.out.println(obj);
        }

        /*如果想要让集合只能存同样类型的数据，使用泛型*/
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
    }
}
