package com.collection;

import java.util.*;

/**
 * 关于集合遍历、迭代
 * iterable方法中的iterator方法在Collection中可以用，在Map中不能用
 */
public class Collection02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();//new ArrayList()、new Vector()、new HashSet()、new TreeSet()
        c.add(12);
        c.add(231);     //TreeSet和HashSet集合中的元素是无序且不可重复的，且没有下标
        c.add(31);
        c.add(43);
        c.add(new TreeSet<>());
        c.add(6);
        c.add(6);

        //①、获取迭代器对象,遍历集合。由于iterator是一个接口，无法new对象，所以要通过
        //这种方式进行创建
        Iterator it = c.iterator();
        /**
         * 迭代器中的方法
         *boolean hasNext(),若仍有元素可以迭代，返回true
         * Object next() 返回迭代的下一个元素
         * 执行原理:
         * 若后面有下一个元素，那么hasNext()方法会返回一个true
         * 此时会执行next()方法，往后面走一位，返回一个Object
         * 若返回false，则停止while循环
         */
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

    }
}
