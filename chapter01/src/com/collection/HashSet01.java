package com.Collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 无序不可重复
 */
public class HashSet01 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(12);
        hs.add(21);
        hs.add(43);
        hs.add(3);
        hs.add(3);

        Iterator it = hs.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
