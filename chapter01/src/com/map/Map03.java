package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历
 */
public class Map03 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"I");
        map.put(2,"love");
        map.put(3,"you");

        //获取map中所有的key
        Set<Integer> in = map.keySet();
        Iterator<Integer> it = in.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            String v1 = map.get(i);
            System.out.println("key:" + i + ",value:" + v1);

        }
        //foreach
        for (Integer key : in
             ) {
            System.out.println("key:" + key + ",value:" + map.get(key));
        }


    }
}
