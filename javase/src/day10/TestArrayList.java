package day10;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.List;

/**
 * Author wangyi
 * Create 2020-09-22 22:54
 * ClassName TestArrayList
 * Version 1.0
 */
public class TestArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");//第一个索引下标为0
        list.add("b");//第二个索引下标为1
        list.add("c");//第三个索引下标为2
        list.add("d");//第四个索引下标为3
        //在集合类某个位置添加一个元素
        list.add(2, "a");
        System.out.println(list);
        //访问指定索引下标位置的集合元素
        System.out.println(list.get(3));


        List<String> list1 = new ArrayList<String>();
        list1.add("123");
        list1.add("456");
        //addAll在集合某个位置插入一个集合
        list.addAll(4, list1);
        System.out.println(list);
        System.out.println(list.size());
        //indexOf元素在集合中第一次出现的索引下标
        System.out.println(list.indexOf("a"));
        //lastIndexOf元素在集合中最后一次出现的索引下标
        System.out.println(list.lastIndexOf("a"));
        //set根据元素索引下标修改值
        list.set(1, "bb");
        System.out.println(list);
        //subList根据索引下标的起始位置截取一段元素形成一个性的集合
        List<String> sublist = list.subList(2, 4);
        System.out.println(sublist);

        for (Object obj :list){
            System.out.println(obj);
        }
    }
}
