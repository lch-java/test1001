package com.collection;

import java.util.*;

/**
 * 集合工具类Collections
 */
public class Collections01 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        //将ArrayList集合从非线程安全转成线程安全
        Collections.synchronizedList(arr);

        //排序(对实现Comparable接口的类可以直接排序，对自定义的类排序要先去实现Comparable接口)
        arr.add("1");
        arr.add("4");
        arr.add("2");
        arr.add("3");

        //sort方法的两种参数
        //①、Collections.sort(list集合对象);
        Collections.sort(arr);
        //②、Collections.sort(list集合对象,比较器对象);
        for (String s:arr
             ) {
            System.out.println(s);
        }

        Set<String> set = new HashSet<>();
        set.add("lch");
        set.add("lc");
        set.add("d");
        set.add("as");
        //将set集合转成List集合，再进行排序，因为工具类的sort只能传list集合对象
        List<String> list = new ArrayList<>(set);


    }
}
