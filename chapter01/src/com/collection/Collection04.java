package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 深入boolean remove(Object obj),作用:删除集合中的某一个对象的内存地址
 *remove底层也调用了equals方法
 */
public class Collection04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Integer i1 = 1;
        c.add(i1);
        Integer i2 =1;
        //c.add(i2);
        c.remove(i2);
        System.out.println(c.size());//0


    }
}
