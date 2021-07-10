package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Map02 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<Integer,String> map = new HashMap<>();

        //添加键值对
        map.put(1,"I"); //1在这里仍然进行了装箱
        map.put(2,"love"); //2在这里仍然进行了装箱
        map.put(3,"you"); //3在这里仍然进行了装箱
        map.put(4,"..."); //4在这里仍然进行了装箱

        //通过key获取value,V get(Object key)
        String s = map.get(1);
        System.out.println(s);

        //获取键值对的数量
        int num = map.size();
        System.out.println(num);    //4

        //通过key键删除键值对，V remove(Object key)
        String v1 = map.remove(4);
        System.out.println(map.size()); //3

        //判断是否包含某个key
        boolean k1 = map.containsKey(3);
        System.out.println(k1);

        //判断是否包含某个key
        boolean v2 = map.containsValue(3);
        System.out.println(v2);

        //清空集合
       // map.clear();

        //判断是否集合为空(不是null)
        map.isEmpty();

        //获取所有的value
        Collection<String> c = map.values();
        for (String s1:c
             ) {
            System.out.println(s1);
        }


    }
}
