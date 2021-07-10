package com.map;

import java.util.Properties;

/**
 * properties中的常用的方法
 * key和value都是String类型的，被称为属性类对象
 * 线程安全的
 */
public class Properties01 {
    public static void main(String[] args) {
        Properties p = new Properties();
        //Object setProperty(String key,String value)底层就是V put(K key,V value)
        //存
        p.setProperty("1","root");

        //取 String getProperty(String key)
        String s = p.getProperty("1");


    }
}
