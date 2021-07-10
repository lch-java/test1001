package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 * 深入contain(Object o)实例且boolean，判断某个集合中是否包含o对象
 * 底层原理:将x作为参数传进去调用x.equals(s)，而x是String类型，String类型的
 * equals经过重写，所以就算没有将x add到集合里，返回的也是true
 * 这里的x和s确实是两个不同的内存地址，但contain方法比较的是对象本身的内容
 */
public class Collection03 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String s = new String("abc");
        c.add(s);
        c.add(new String("def"));
        System.out.println(c.size());
        String x = new String("abc");
        System.out.println(c.contains(x));  //true

        Integer i = 1;
        c.add(i);
        Integer i1 = 1;
        System.out.println(c.contains(i1));  //true

        User u = new User("梁");
        c.add(u);
        User u1 = new User("梁");
        System.out.println(c.contains(u1)); //false     重写equals方法后就算true

    }
}

class User{
    private String name;
    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof User)) return false;
        if (this == obj) return true;
        User user = (User) obj;
        return user.name.equals(name);
    }

}
