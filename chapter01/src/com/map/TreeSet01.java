package com.map;

import java.util.TreeSet;

/**
 * TreeSet底层实际上是一个TreeMap
 * TreeMap底层是一个二叉树
 * 放到TreeMap中key部分的元素等同于TreeSet中的元素
 * TreeSet集合的元素无序不可重，但可排序，被称为可排序集合
 * TreeSet无法对自定义类型排序，需要实现java.lang.Comparable接口
 */
public class TreeSet01 {
    public static void main(String[] args) {


        //默认升序排列
        TreeSet<String> ts = new TreeSet<>();
        ts.add("a");
        ts.add("d");
        ts.add("c");
        ts.add("b");

        for (String tst:ts
             ) {
            System.out.println(tst);
        }

    }
}
