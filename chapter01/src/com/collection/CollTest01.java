package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合的练习
 */
public class CollTest01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Integer i1 = 1;
        c.add(i1);
        Integer i2 = 1;
        System.out.println(i1 == i2);   //true
        c.add(1);
        c.add("w");
        c.add(new ArrayList<>());
        Iterator it = c.iterator();
        /**
         * 迭代器的使用
         */
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        /**
         * Collection中几个重要的方法
         */
        c.add(1);//给集合添加元素
       /* c.size(); //查询集合中元素个数
        c.clear();//清空集合
        c.isEmpty();//判断集合有无元素
        c.contains(1);//判断集合中是否有该对象
        c.remove(2)*/;//删除集合中的某一个对象

        /**
         * boolean contains(Object obj)底层调用了equals，若是判断重写了equals的类的对象，实际上判断的则是传入的对象的字面值
         * 是否和集合中原有对象的字面值有一样的，有的话，则true，无则false
         * Object remove(Object obj)底层调用了equals,若是判断重写了equals的类的对象，实际是删除的是(传入的字面值对象)和
         * 集合中元素的字面值相等的对象
         */


    }
}
