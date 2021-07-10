package com.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *Map集合中常用的方法
 * V put (K key,V value) 向Map集合中添加键值对
 * V get(Object key) 通过key获取value
 * void clear() 清空Map集合
 * boolean containKey(Object key)，判断Map中是否含有某个key
 * boolean containValue(Object value)
 * boolean isEmpty()
 * Set<k> keySet() 获取Map集合所有的key，即一个Set集合
 * V remove(Object key)通过key删除键值对,返回的是删除的value值
 *Collection<V> values() 获取Map集合中所有的value，返回一个Collection集合
 * Set<Map.Entry<K,V>> entrySet() 将Map集合转成Set集合,此时将Map中的K,V看成
 * K=V这种形式(K=V此时表示一个元素，此时的元素类型是Map.Entry类型)的一种Set集合
 * Map.Entry这个整体是一种类型,Map类中的静态内部类Map.Entry,将它看成一个整体即可
 * 此时它的类名叫做Map.Entry
 *
 *
 */
public class Map01 {
    public static void main(String[] args) {
        //一样
        Set<Map.Entry> s = new HashSet<>();

        Set<String> s1 = new HashSet<>();

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");

        String i = map.remove(1);
        System.out.println(i);

    }
}
