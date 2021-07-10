package com.collection;

import com.sun.deploy.util.OrderedHashSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollTest02 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        Iterator it  = a.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

    }
}
