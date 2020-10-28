package day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Author wangyi
 * Create 2020-09-22 23:20
 * ClassName TestHashMap
 * Version 1.0
 */
public class TestHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        //允许空键和空值
        map.put(null, null);
        //根据K移除元素
        map.remove("c");
        System.out.println(map);
        //输出集合中的所有值
        System.out.println(map.values());
        System.out.println(map.size());
        //指定输出集合中的值
        System.out.println(map.get("b"));
        //判断集合是否包含指定的key
        System.out.println(map.containsKey("a"));
        //判断集合是否包含指定的value
        System.out.println(map.containsValue(5));
//        //获取集合的所有value值
//        System.out.println(map.values());
//        //获取集合的所有key集合
//        System.out.println(map.keySet());

        /*map集合遍历*/
        map.values();
        //获取map集合里面的key集合
        Set<String> keys = map.keySet();
        //1、通过map.keySet();
        for (String key : keys) {
            System.out.println("key" + key + ",value：" + map.get(key));
        }
        //2、通过map.entrySet();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> en : entries) {
            System.out.println("key" + en.getKey() + ",value" + en.getValue());
        }

        /*TreeMap自然排序=字典排序*/
        Map<Integer, String> map1 = new TreeMap<Integer, String>();
        map1.put(4, "d");
        map1.put(3, "c");
        map1.put(2, "b");
        map1.put(1, "a");
        System.out.println(map1);

        Map<String, String> map2 = new TreeMap<String, String>();
        map2.put("a","a");
        map2.put("c","c");
        map2.put("b","b");
        System.out.println(map2);
    }
}
