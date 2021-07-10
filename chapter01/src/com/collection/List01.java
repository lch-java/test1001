package com.collection;
/**
 * List集合中特有的方法
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        List list = new ArrayList();

        //向集合的末尾添加元素
        list.add(1);
        list.add(2);

        //向集合的指定位置添加元素，其他的元素向后平移一个位置
        list.add(1,"king");

        //修改指定下标的元素
        // Object set(in index,Object element)
        list.set(2,"queen");

        //迭代器
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        /**
         * List集合有自己特有的遍历方式，因为有下标，所以可以用for循环,然后通过get方法
         * Object get(int index)根据下标获取元素
         */

        Object obj01 = list.get(1);
        System.out.println(obj01);

        for (int i=0;i<list.size();i++){
            Object obj = list.get(i);
            System.out.println(obj);
        }

        //获取指定对象第一次出现的索引
        //int indexOf(Object o)
        System.out.println(list.indexOf("king"));   //1

        //获取指定对象最后一次出现的索引
        //int lastIndexOf(Object o)
        System.out.println(list.lastIndexOf("king"));   //1

        //删除指定下标位置的元素
        list.remove(1);
        System.out.println(list.get(1));    //queen



    }
}
