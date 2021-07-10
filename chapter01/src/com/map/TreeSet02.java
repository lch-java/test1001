package com.map;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet排序的第二种方式
 * 在new TreeMap对象时，给它添加一个自定义的泛型，为了让它可以排序，此时用到的第二种方式
 * 使用比较器的方式进行排序，在new TreeMap对象时，调用它的有参构造方法，传进去一个比较器
 *
 * 排序方式的选择
 * 若是排序规则不变的话，就实现Comparable
 * 若是排序规则经常变的话，就去写Comparator比较器,可以进行比较器的切换
 */
public class TreeSet02 {
    public static void main(String[] args) {

        Person p1 = new Person(2);
        System.out.println(p1);     //2
        Person p2 = new Person(3);
        Person p3 = new Person(12);
        Person p4 = new Person(4);

        //java.lang.ClassCastException: com.map.Person cannot be cast to java.lang.Comparable
        //使用比较器的方式进行排序，在new TreeMap对象时，调用它的有参构造方法，传进去一个比较器
        //TreeSet<Person> persons = new TreeSet<>(new PersonCompartor());
        //使用匿名内部类的方式实现
        TreeSet<Person> persons = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.id - o2.id;
            }
        });
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        for (Person p: persons
             ) {
            System.out.println(p);
        }


    }
}
