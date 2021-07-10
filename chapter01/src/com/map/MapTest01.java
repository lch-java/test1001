package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历测试
 */
public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"I");
        map.put(2, "love");
        map.put(3,"you");
        Set<Integer> set = map.keySet();
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer in = it.next();
            String s = map.get(in);
            System.out.println("Key:" + in + ",value:" + s);
        }

        for( Integer in : set){
            System.out.println("Key:" + in + ",value:" + map.get(in));
        }

        Set<Map.Entry<Integer,String>> set01 = map.entrySet();
        for(Map.Entry<Integer,String> m : set01){
            System.out.println(m);
        }
        Iterator<Map.Entry<Integer,String>> it01 = set01.iterator();
        while(it01.hasNext()){
            Map.Entry<Integer,String> in = it01.next();
            System.out.println(in);
        }
    }
}
