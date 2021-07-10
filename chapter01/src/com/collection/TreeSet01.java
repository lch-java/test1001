package com.Collection;
/**
 * TreeSet集合演示
 * 无序不可重复且无下标，且从大到小排序
 */

import java.util.Collection;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
        Collection<String> s = new TreeSet<>();
        s.add("ds");
        s.add("ad");
        s.add("sd");
        s.add("c");
        s.add("bsa");

        for (String elements: s
             ) {
            System.out.println(elements);
        }
    }
}
