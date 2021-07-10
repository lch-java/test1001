package com.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        List<String> s  =  new LinkedList<>();
        s.add("love");
        s.add("you");
        s.add("and");
        s.add("...");

        for (int i =0;i<s.size();i++){
            System.out.println(s.get(i));
        }

        System.out.println(Collections.binarySearch(s,"you"));
    }
}
