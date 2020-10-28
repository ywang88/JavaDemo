package day10;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeSet;

/**
 * 根据某个属性排序
 * 实现Comparator接口进行排序
 * Author wangyi
 * Create 2020-09-22 22:39
 * ClassName TestTreeSet1
 * Version 1.0
 */
public class TestTreeSet1 {
    public static void main(String[] args) {
        Person person = new Person(2, "张三");
        Person person1 = new Person(67, "李四");
        Person person2 = new Person(32, "王五");
        Person person3 = new Person(23, "赵六");
        Set<Person> treeSet = new TreeSet<Person>(new Person());
        treeSet.add(person);
        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);
        for (Person person4 : treeSet) {
            System.out.println(person4.name + "   " + person4.age);
        }
    }

    static class Person implements Comparator<Person> {
        int age;
        String name;

        public Person() {

        }

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compare(Person o1, Person o2) {
            //根据年龄正序排序
            if (o1.age < o2.age) {
                return 1;
            } else if (o1.age > o2.age) {
                return -1;
            } else {
                return 0;
            }

        }
    }
}

