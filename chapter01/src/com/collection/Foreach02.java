package com.Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * lIST集合的三种便利、迭代方式
 */
public class Foreach02 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(3);
        l.add(144);
        l.add(15);
        Arrays.sort(l.toArray());

        Iterator<Integer> it = l.iterator();
        while (it.hasNext()){
            Integer in = it.next();
            System.out.println(in);
        }
        //普通for循环会用到下标
        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }

        //foreach用不到下标，
        for (Integer i : l
             ) {
            System.out.println(i);
        }

   }
}
