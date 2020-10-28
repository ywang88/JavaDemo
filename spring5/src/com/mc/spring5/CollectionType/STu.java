package com.mc.spring5.CollectionType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Author wangyi
 * Create 2020-10-15 23:03
 * ClassName STu
 * Version 1.0
 * 数组类型属性注入
 */
public class STu {
    //数组类型属性注入
    private String[] courses;

    //list集合类型注入
    private List<String> list;

    //map集合类型注入
    private Map<Object, Object> stringMap;

    //set集合属性
    private Set<String> stringSet;

    //list对象
    private List<Courese> coureseList;

    public void setCoureseList(List<Courese> coureseList) {
        this.coureseList = coureseList;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setStringMap(Map<Object, Object> stringMap) {
        this.stringMap = stringMap;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public void add() {
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(stringMap);
        System.out.println(stringSet);
        System.out.println(coureseList);
    }
}
