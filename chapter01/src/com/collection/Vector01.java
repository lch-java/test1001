package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Vector底层是一个Object类型的数组，默认初始化容量为10，自动扩容为原来的2倍
 * 大多方法带有synchronized关键字，线程安全的，已有另外的方案可以解决线程安全
 * 所以vector用的比较少
 */
public class Vector01 {
    public static void main(String[] args) {
        //Collections工具类
        //非线程转成线程,synchronized方法
        List arr = new ArrayList();
        Collections.synchronizedList(arr);
    }

}
