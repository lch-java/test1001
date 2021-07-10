package com.collection;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection集合中能存放什么元素?
 * 没有泛型的话，可以存取所有Object的子类，即所有的引用数据类型对应对象的内存地址
 * 有泛型的话就只能存某一类的引用数据类型对应对象的内存地址
 */
public class Collection01 {
    public static void main(String[] args) {
        Collection arr = new ArrayList();
        /**
         * Collection常用的方法
         * ①、add(Object e),返回值是boolean，实例，向集合中添加元素
         * ②、size(),实例且返回int，获取集合中元素的个数
         * ③、void clear() 清空集合中的所有元素
         * ④、contains(Object o)实例且返回布尔，判断调用者集合是否包含对象o
         * ⑤、remove (Object o)实例且返回布尔，删除集合中的某一个元素
         * ⑥、isEmpty() 实例且返回布尔，判断集合中元素的个数是否为0
         * ⑦、toArray() 实例且返回Object数组，把集合转换成数组
         */
        //这里存放的的不是基本数据类型，而是对应的包装类型的内存地址，因为会自动装箱
        arr.add(1);
        System.out.println(arr.add(2)); //true
        arr.add(false);
        //这里存放的是一个新的ArrayList类型的集合对象的内存地址
        arr.add(new ArrayList<>());
        //存放一个CoCo对象的内存地址
        arr.add(new CoCo());


        //②、获取集合中元素的个数
        System.out.println(arr.size()); //5

        //③、清空集合中的所有元素
        arr.clear();
        System.out.println(arr.size());//0

        //④、判断调用者集合是否包含元素o
        arr.add(3);
        System.out.println(arr.contains(3));//true

        //⑤、删除集合中的某一个元素
        arr.remove(3);
        System.out.println(arr.size());//0

        //⑥、判断集合中元素的个数是否为0
        System.out.println(arr.isEmpty());  //true



    }
}
class CoCo{}